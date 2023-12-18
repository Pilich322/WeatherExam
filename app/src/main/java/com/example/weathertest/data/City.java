package com.example.weathertest.data;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class City {
    @SerializedName("LocalObservationDateTime")
    public Date localObservationDateTime;
    @SerializedName("EpochTime")
    public int epochTime;
    @SerializedName("WeatherText")
    public String weatherText;
    @SerializedName("WeatherIcon")
    public int weatherIcon;
    @SerializedName("HasPrecipitation")
    public boolean hasPrecipitation;
    @SerializedName("PrecipitationType")
    public Object precipitationType;
    @SerializedName("IsDayTime")
    public boolean isDayTime;
    @SerializedName("Temperature")
    public Temperature temperature;
    @SerializedName("MobileLink")
    public String mobileLink;
    @SerializedName("Link")
    public String link;
}
