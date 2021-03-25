package com.example.homeassignment.domain;

public class ListingRequest {

    private Long minPrice;
    private Long maxPrice;
    private Integer minBed;
    private Integer maxBed;
    private Integer minBath;
    private Integer maxBath;

    public ListingRequest(Long min_price, Long max_price, Integer min_bed, Integer max_bed, Integer min_bath, Integer max_bath) {
        this.minPrice = min_price;
        this.maxPrice = max_price;
        this.minBed = min_bed;
        this.maxBed = max_bed;
        this.minBath = min_bath;
        this.maxBath = max_bath;
    }

    public Long getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Long minPrice) {
        this.minPrice = minPrice;
    }

    public Long getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Long maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getMinBed() {
        return minBed;
    }

    public void setMinBed(Integer minBed) {
        this.minBed = minBed;
    }

    public Integer getMaxBed() {
        return maxBed;
    }

    public void setMaxBed(Integer maxBed) {
        this.maxBed = maxBed;
    }

    public Integer getMinBath() {
        return minBath;
    }

    public void setMinBath(Integer minBath) {
        this.minBath = minBath;
    }

    public Integer getMaxBath() {
        return maxBath;
    }

    public void setMaxBath(Integer maxBath) {
        this.maxBath = maxBath;
    }
}
