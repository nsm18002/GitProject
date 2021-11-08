package com.example.placestest;

import android.os.AsyncTask;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.libraries.places.api.model.Place;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

public class GetStoresData extends AsyncTask <Object, String, String> {
    String googlePlacesData;
    ArrayList<Store> stores;
    GoogleMap googleMap;

    RequestQueue queue;
    private final String APIKey = "AIzaSyAS-Ubm1jIWqAc7V7R4ALZSZpK8Gfzz3-0";
    String url = "https://maps.googleapis.com/maps/api/place/search/json?";
    String longitude = "59.617726";
    String latitude ="16.550616";

    "https://maps.googleapis.com/maps/api/place/nearbysearch/json?key=AIzaSyAS-Ubm1jIWqAc7V7R4ALZSZpK8Gfzz3-0&location=59.617726,16.550616&radius=1500&name=grocery"

    MainActivity mainActivity;
    JSONObject places = new JSONObject();

    public GetStoresData(ArrayList<Store> referenceList){
        stores = referenceList;


        url = url+"key"+APIKey;
        url = url+"location"+latitude+","+longitude;
        url = url+"radius"+700;
        url = url+"sensor"+"false";

    }

    @Override
    protected void doInBackground(Object[] objects) {

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                try {
                    places = response.getJSONObject("");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });


        queue.add(jsonObjectRequest);
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
