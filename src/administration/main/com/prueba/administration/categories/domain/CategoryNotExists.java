package com.prueba.administration.categories.domain;

import com.prueba.shared.domain.DomainError;

public class CategoryNotExists extends DomainError {
    public CategoryNotExists(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }
}
