package com.prueba.shared.infrastructure;

import com.prueba.shared.domain.Service;
import com.prueba.shared.domain.UuidGenerator;

import java.util.UUID;

@Service
public class JavaUuidGenerator implements UuidGenerator {

    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }

}
