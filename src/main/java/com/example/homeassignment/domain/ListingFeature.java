package com.example.homeassignment.domain;

public class ListingFeature {

    private String type;
    private ListingGeometry geometry;
    private ListingProperties properties;

    public ListingFeature(CsvListing csvListing) {
        this.properties = new ListingProperties(csvListing);
        this.geometry = new ListingGeometry(csvListing.getLng(), csvListing.getLat());
    }

    public String getType() {
        return "Feature";
    }

    public ListingGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(ListingGeometry geometry) {
        this.geometry = geometry;
    }

    public ListingProperties getProperties() {
        return properties;
    }

    public void setProperties(ListingProperties properties) {
        this.properties = properties;
    }
}
