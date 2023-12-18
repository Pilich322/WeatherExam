package com.example.weathertest;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AccuWeatherApiClient {
    private static final String BASE_URL = "https://dataservice.accuweather.com/";
    public static final String API_KEY = "X8r1aWZrvelTFAxFmM3AkX4Wz4GL6vJx";

    public AccuWeatherService getAccuWeatherService() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        // Добавляем API-ключ в заголовок запроса
        httpClient.addInterceptor(chain -> {
            Request original = chain.request();
            Request request = original.newBuilder()
                    .header("apikey", API_KEY)
                    .method(original.method(), original.body())
                    .build();
            return chain.proceed(request);
        });

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(logging);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        return retrofit.create(AccuWeatherService.class);
    }
}
