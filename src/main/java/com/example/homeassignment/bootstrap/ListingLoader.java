package com.example.homeassignment.bootstrap;

import com.example.homeassignment.repositories.ListingRepository;
import com.example.homeassignment.services.CsvLoaderService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ListingLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final ListingRepository listingRepository;
    private final CsvLoaderService csvLoaderService;

    public ListingLoader(ListingRepository listingRepository, CsvLoaderService csvLoaderService) {
        this.listingRepository = listingRepository;
        this.csvLoaderService = csvLoaderService;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        listingRepository.insert(csvLoaderService.getCsvListings());
        System.out.println("Listings Loaded Successfully to Mongo");
    }
}
