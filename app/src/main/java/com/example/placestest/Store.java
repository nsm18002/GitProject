package com.example.placestest;

public class Store {
    private String name;
    private double latiture;
    private double longitude;
    private int distance_in_meters;

    public Store(){

    }

    public String getName(){
        return name;
    }

    public int getDistance(){
        return distance_in_meters;
    }
}
