package com.example.weathertest;

import com.example.weathertest.data.City;
import com.example.weathertest.data.CityKey;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AccuWeatherService {
    //ПОлучение информации по городу. Погода хранится в классе Metric
    @GET("currentconditions/v1/{locationKey}")
    Call<List<City>> getCurrentWeather(
            @Path("locationKey") String locationKey,
            @Query("apikey") String apiKey
    );
    //Получение кода города
    @GET("locations/v1/cities/search")
    Call<List<CityKey>> searchCity(
            @Query("apikey") String apiKey,
            @Query("q") String query
    );
}