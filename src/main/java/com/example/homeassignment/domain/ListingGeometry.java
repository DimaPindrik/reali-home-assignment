package com.example.homeassignment.domain;

import java.util.ArrayList;
import java.util.List;

public class ListingGeometry {

    private String type;
    private List<Double> coordinates = new ArrayList<>();

    public ListingGeometry(Double lat, Double lng) {
        this.coordinates.add(lat);
        this.coordinates.add(lng);
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return "Point";
    }
}
