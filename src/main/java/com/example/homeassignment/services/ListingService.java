package com.example.homeassignment.services;

import com.example.homeassignment.domain.CsvListing;
import com.example.homeassignment.domain.ListingRequest;
import com.example.homeassignment.repositories.ListingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {

    private final ListingRepository listingRepository;

    public ListingService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

    public List<CsvListing> getListings(ListingRequest request) {
        return listingRepository.findByParams(
                request.getMinPrice(),
                request.getMaxPrice(),
                request.getMinBed(),
                request.getMaxBed(),
                request.getMinBath(),
                request.getMaxBath()
        );
    }

    public Page<CsvListing> getListingsByPage(ListingRequest request, Pageable paging) {
        return listingRepository.findByPriceBetweenAndBedroomsBetweenAndBathroomsBetween(
                request.getMinPrice(),
                request.getMaxPrice(),
                request.getMinBed(),
                request.getMaxBed(),
                request.getMinBath(),
                request.getMaxBath(),
                paging
        );
    }
}
