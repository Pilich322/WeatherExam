package com.example.weathertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.weathertest.data.City;
import com.example.weathertest.data.CityKey;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    String locationKey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AccuWeatherApiClient accuWeatherApiClient = new AccuWeatherApiClient();
        AccuWeatherService service = accuWeatherApiClient.getAccuWeatherService();
        // Вам необходимо дописать код для получения кода города введенного в EditText
        // и получения погоды в этом городе на данный момент.
        // Методы получения информации хранятся и вся остальная информацию находится AccuWeatherService
    }
}