package com.example.homeassignment.services;

import com.example.homeassignment.domain.CsvListing;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.InputStreamReader;
import java.util.List;

@Service
public class CsvLoaderService {

    @Value( "${aws.listings.url}" )
    private String URL;

    private final RestTemplate restTemplate;

    public CsvLoaderService() {
        this.restTemplate = new RestTemplate();
    }

    public List<CsvListing> getCsvListings() {
        return restTemplate.execute(URL, HttpMethod.GET, null, clientHttpResponse -> {
            InputStreamReader reader = new InputStreamReader(clientHttpResponse.getBody());
            CsvToBean<CsvListing> csvToBean = new CsvToBeanBuilder<CsvListing>(reader)
                    .withType(CsvListing.class)
                    .withSeparator(',')
                    .withSkipLines(1) // skip the header cells
                    .withIgnoreLeadingWhiteSpace(true)
                    .withFilter(lines -> {
                        // escape empty lines
                        for (String line : lines) {
                            if (line != null && line.length() > 0) {
                                return true;
                            }
                        }
                        return false;
                    })
                    .build();
            return csvToBean.parse();
        });
    }
}
