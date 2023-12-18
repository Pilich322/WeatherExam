package com.example.weathertest.data;

import com.google.gson.annotations.SerializedName;

public class Metric{

//Числовое значение погоды
    @SerializedName("Value")
    public double value;
    //Еденица измерения погоды в Цельсиях
    @SerializedName("Unit")
    public String unit;
    @SerializedName("UnitType")
    public int unitType;
}