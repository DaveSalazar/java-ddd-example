package com.prueba.shared.domain.events;

import com.prueba.shared.domain.bus.event.DomainEvent;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public class CategorySavedDomainEvent extends DomainEvent {

    private final String parentId;
    private final String name;

    public CategorySavedDomainEvent(String aggregateId, String eventId, String occurredOn, String parentId, String name) {
        super(aggregateId, eventId, occurredOn);
        this.parentId = parentId;
        this.name = name;
    }

    public CategorySavedDomainEvent(String aggregateId, String parentId, String name) {
        super(aggregateId);
        this.parentId = parentId;
        this.name = name;
    }

    public CategorySavedDomainEvent() {
        this.parentId = null;
        this.name = null;
    }

    @Override
    public String eventName() {
        return "category_saved";
    }

    @Override
    public HashMap<String, Serializable> toPrimitives() {
        return new HashMap<String, Serializable>() {{
            put("parentId", parentId);
            put("name", name);
        }};
    }

    @Override
    public DomainEvent fromPrimitives(String aggregateId, HashMap<String, Serializable> body, String eventId, String occurredOn) {
        return new CategorySavedDomainEvent(
                aggregateId,
                eventId,
                occurredOn,
                (String) body.get("parentId"),
                (String) body.get("name")
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorySavedDomainEvent that = (CategorySavedDomainEvent) o;
        return Objects.equals(parentId, that.parentId) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, name);
    }
}
