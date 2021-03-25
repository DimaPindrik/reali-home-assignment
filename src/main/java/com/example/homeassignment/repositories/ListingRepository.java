package com.example.homeassignment.repositories;

import com.example.homeassignment.domain.CsvListing;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ListingRepository extends MongoRepository<CsvListing, Long> {

    @Query("{$and :["
            + "{ $or : [ { $where: '?0 == null' } , { 'price' : { $gte: ?0 } } ] },"
            + "{ $or : [ { $where: '?1 == null' } , { 'price' : { $lte: ?1 } } ] },"
            + "{ $or : [ { $where: '?2 == null' } , { 'bedrooms' : { $gte: ?2 } } ] },"
            + "{ $or : [ { $where: '?3 == null' } , { 'bedrooms' : { $lte: ?3 } } ] },"
            + "{ $or : [ { $where: '?4 == null' } , { 'bathrooms' : { $gte: ?4 } } ] },"
            + "{ $or : [ { $where: '?5 == null' } , { 'bathrooms' : { $lte: ?5 } } ] }"
            + "]}")
    List<CsvListing> findByParams(Long minPrice, Long maxPrice, Integer minBed, Integer maxBed, Integer minBath, Integer maxBath);

    Page<CsvListing> findByPriceBetweenAndBedroomsBetweenAndBathroomsBetween(Long minPrice, Long maxPrice,
                                                                             Integer minBed, Integer maxBed,
                                                                             Integer minBath, Integer maxBath, Pageable pageable);
}
