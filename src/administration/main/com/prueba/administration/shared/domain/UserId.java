package com.prueba.administration.shared.domain;


import com.prueba.shared.domain.Identifier;

public class UserId extends Identifier {
    public UserId(String value) {
        super(value);
    }

    private UserId() {
    }
}
