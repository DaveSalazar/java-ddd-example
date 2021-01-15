package com.prueba.shared.domain.bus.command;

import com.prueba.shared.domain.errors.ParameterNotExists;

public interface CommandHandler<T extends Command> {
    void handle(T command) throws ParameterNotExists;
}
