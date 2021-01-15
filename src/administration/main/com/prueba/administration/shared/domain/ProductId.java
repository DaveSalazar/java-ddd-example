package com.prueba.administration.shared.domain;

import com.prueba.shared.domain.Identifier;

public class ProductId extends Identifier {
    public ProductId(String value) {
        super(value);
    }

    private ProductId() {
    }
}
