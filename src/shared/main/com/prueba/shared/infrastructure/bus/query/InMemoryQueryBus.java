package com.prueba.shared.infrastructure.bus.query;

import com.prueba.shared.domain.Service;
import com.prueba.shared.domain.bus.query.Query;
import com.prueba.shared.domain.bus.query.QueryBus;
import com.prueba.shared.domain.bus.query.QueryHandlerExecutionError;

@Service
public class InMemoryQueryBus implements QueryBus {

    @Override
    public <R> R ask(Query query) throws QueryHandlerExecutionError {
        return null;
    }
}
