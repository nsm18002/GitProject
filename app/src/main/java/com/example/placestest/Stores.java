package com.example.placestest;

import android.content.Context;

import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;

public class Stores {

    public Stores(Context context){
        Places.initialize(context.getApplicationContext(), APIKey);
        // Create a new Places client instance
        PlacesClient placesClient = Places.createClient(context);

    }


    private static void loadStores(float radius){

    }
}
