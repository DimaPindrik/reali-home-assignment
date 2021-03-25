package com.example.homeassignment.domain;


import java.util.List;
import java.util.stream.Collectors;

public class ListingGeoResponse {

    private String type;
    private List<ListingFeature> features;

    public ListingGeoResponse(List<CsvListing> csvListings) {
        this.features = csvListings
                .stream()
                .map(ListingFeature::new)
                .collect(Collectors.toList());
    }

    public String getType() {
        return "FeatureCollection";
    }

    public List<ListingFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<ListingFeature> listingFeature) {
        this.features = listingFeature;
    }
}
