package com.prueba.shared.domain.bus.event;

import com.prueba.shared.domain.Utils;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.UUID;

public abstract class DomainEvent {

    private String aggregateId;
    private String eventId;
    private String occurredOn;

    public DomainEvent(String aggregateId, String eventId, String occurredOn) {
        this.aggregateId = aggregateId;
        this.eventId = eventId;
        this.occurredOn = occurredOn;
    }


    public DomainEvent(String aggregateId) {
        this.aggregateId = aggregateId;
        this.eventId = UUID.randomUUID().toString();
        this.occurredOn = Utils.dateToString(LocalDateTime.now());
    }

    protected DomainEvent() {}

    public abstract String eventName();

    public abstract HashMap<String, Serializable> toPrimitives();

    public abstract  DomainEvent fromPrimitives(String aggregateId, HashMap<String, Serializable> body, String eventId,
                                                String occuredOn);

    public String aggregateId() {
        return aggregateId;
    }

    public String eventId() {
        return eventId;
    }

    public String occurredOn() {
        return occurredOn;
    }
}