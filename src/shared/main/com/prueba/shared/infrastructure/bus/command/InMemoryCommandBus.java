package com.prueba.shared.infrastructure.bus.command;

import com.prueba.shared.domain.Service;
import com.prueba.shared.domain.bus.command.Command;
import com.prueba.shared.domain.bus.command.CommandBus;
import com.prueba.shared.domain.bus.command.CommandHandlerExecutionError;

@Service
public class InMemoryCommandBus implements CommandBus {

    @Override
    public void dispatch(Command command) throws CommandHandlerExecutionError {

    }
}
