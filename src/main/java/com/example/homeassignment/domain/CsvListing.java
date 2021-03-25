package com.example.homeassignment.domain;

import com.opencsv.bean.CsvBindByPosition;

import javax.persistence.Id;

public class CsvListing {

    @Id
    @CsvBindByPosition(position = 0)
    private Long id;
    @CsvBindByPosition(position = 1)
    private String street;
    @CsvBindByPosition(position = 2)
    private String status;
    @CsvBindByPosition(position = 3)
    private Long price;
    @CsvBindByPosition(position = 4)
    private Integer bedrooms;
    @CsvBindByPosition(position = 5)
    private Integer bathrooms;
    @CsvBindByPosition(position = 6)
    private Long sq_ft;
    @CsvBindByPosition(position = 7)
    private Double lat;
    @CsvBindByPosition(position = 8)
    private Double lng;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
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

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
