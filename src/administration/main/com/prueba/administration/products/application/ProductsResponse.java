package com.prueba.administration.products.application;

import com.prueba.shared.domain.bus.query.Response;

import java.util.List;

public class ProductsResponse implements Response {

    private final List<ProductResponse> products;

    public ProductsResponse(List<ProductResponse> products) {
        this.products = products;
    }

    public List<ProductResponse> products() {
        return products;
    }
}
