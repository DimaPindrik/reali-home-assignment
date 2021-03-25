package com.example.homeassignment.utils;

import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.Map;

public class PagingUtils {

    private static final String DATA = "data";
    private static final String CURRENT_PAGE = "currentPage";
    private static final String TOTAL_ITEMS = "totalItems";
    private static final String TOTAL_PAGES = "totalPages";

    public static Map<String, Object> getPagingResponse(Page page) {
        Map<String, Object> response = new HashMap<>();
        response.put(DATA, page.getContent());
        response.put(CURRENT_PAGE, page.getNumber());
        response.put(TOTAL_ITEMS, page.getTotalElements());
        response.put(TOTAL_PAGES, page.getTotalPages());
        return response;
    }
}
