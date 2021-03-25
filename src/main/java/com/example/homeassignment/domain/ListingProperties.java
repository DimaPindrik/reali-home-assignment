package com.example.homeassignment.domain;

public class ListingProperties {

    private Long id;
    private Long price;
    private String street;
    private Integer bedrooms;
    private Integer bathrooms;
    private Long sq_ft;

    public ListingProperties(CsvListing csvListing) {
        this.id = csvListing.getId();
        this.price = csvListing.getPrice();
        this.street = csvListing.getStreet();
        this.bedrooms = csvListing.getBedrooms();
        this.bathrooms = csvListing.getBathrooms();
        this.sq_ft = csvListing.getSq_ft();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Long getSq_ft() {
        return sq_ft;
    }

    public void setSq_ft(Long sq_ft) {
        this.sq_ft = sq_ft;
    }
}
