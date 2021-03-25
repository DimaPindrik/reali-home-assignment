package com.example.homeassignment.web;

import com.example.homeassignment.domain.CsvListing;
import com.example.homeassignment.domain.ListingGeoResponse;
import com.example.homeassignment.domain.ListingRequest;
import com.example.homeassignment.services.ListingService;
import com.example.homeassignment.utils.PagingUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/listings")
public class ListingController {

    private final ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @GetMapping("")
    public ResponseEntity<?> getListings(@RequestParam(required = false) long min_price,
                                         @RequestParam(required = false) long max_price,
                                         @RequestParam(required = false) int min_bed,
                                         @RequestParam(required = false) int max_bed,
                                         @RequestParam(required = false) int min_bath,
                                         @RequestParam(required = false) int max_bath) {
        ListingRequest request = new ListingRequest(min_price, max_price, min_bed, max_bed, min_bath, max_bath);
        List<CsvListing> csvListings = listingService.getListings(request);
        ListingGeoResponse response = new ListingGeoResponse(csvListings);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/byPage")
    public ResponseEntity<Map<String, Object>> getListingByPage(@RequestParam(required = false) long min_price,
                                                                @RequestParam(required = false) long max_price,
                                                                @RequestParam(required = false) int min_bed,
                                                                @RequestParam(required = false) int max_bed,
                                                                @RequestParam(required = false) int min_bath,
                                                                @RequestParam(required = false) int max_bath,
                                                                @RequestParam(defaultValue = "0") int page,
                                                                @RequestParam(defaultValue = "3") int size) {
        ListingRequest request = new ListingRequest(min_price, max_price, min_bed, max_bed, min_bath, max_bath);
        Pageable paging = PageRequest.of(page, size);
        Page<CsvListing> csvListingsByPage = listingService.getListingsByPage(request, paging);
        Map<String, Object> response = PagingUtils.getPagingResponse(csvListingsByPage);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
