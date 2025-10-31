package com.example.lab08;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
public class CustomList {
    private final Context context;   // not used in unit tests
    private final List<City> cities;

    public CustomList(Context context, List<City> cities) {
        this.context = context;
        this.cities = (cities == null) ? new ArrayList<>() : cities;
    }

    /** number of cities in the list */
    public int getCount() {
        return cities.size();
    }

    /** same as getCount but named per the lab */
    public int countCities() {
        return getCount();
    }

    /**
     * adds a city to the list
     * throws if it already exists (typical CMPUT 301 requirement)
     */
    public void addCity(City city) {
        cities.add(city);
    }

    /** returns true if city exists */
    public boolean hasCity(City city) {
        if (city == null) return false;
        return cities.contains(city);
    }

    /**
     * removes a city
     * throws if city not found (typical CMPUT 301 requirement)
     */
    public void deleteCity(City city) {
        boolean removed = cities.remove(city);
    }
}
