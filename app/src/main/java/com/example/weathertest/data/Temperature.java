package com.example.weathertest.data;

import com.google.gson.annotations.SerializedName;

public class Temperature {
    @SerializedName("Metric")
    public Metric metric;
    @SerializedName("Imperial")
    public Imperial imperial;
}
