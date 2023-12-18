package com.example.weathertest.data;

import com.google.gson.annotations.SerializedName;

public class Imperial{
    @SerializedName("Value")
    public int value;
    @SerializedName("Unit")
    public String unit;
    @SerializedName("UnitType")
    public int unitType;
}
