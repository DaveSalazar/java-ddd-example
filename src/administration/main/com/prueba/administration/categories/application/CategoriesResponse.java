package com.prueba.administration.categories.application;

import com.prueba.shared.domain.bus.query.Response;

import java.util.List;

public class CategoriesResponse implements Response {
    private final List<CategoryResponse> categories;

    public CategoriesResponse(List<CategoryResponse> categories) {
        this.categories = categories;
    }

    public List<CategoryResponse> categories() {
        return categories;
    }
}
