package com.prueba.administration.categories.domain;

import com.prueba.administration.shared.domain.CategoryId;
import com.prueba.shared.domain.AggregateRoot;
import com.prueba.shared.domain.events.CategorySavedDomainEvent;

import java.util.Objects;

public class Category  extends AggregateRoot {
    private final CategoryId id;
    private final CategoryId parentId;
    private final CategoryName name;

    public Category(CategoryId id, CategoryId parentId, CategoryName name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }

    public Category() {
        this.id = null;
        this.parentId = null;
        this.name = null;
    }

    public static Category create(CategoryId id, CategoryId parentId, CategoryName name) {
        Category category = new Category(id, parentId, name);
        category.record(new CategorySavedDomainEvent(id.value(), parentId.value(), name.value()));
        return category;
    }
    public CategoryId id() {
        return id;
    }

    public CategoryId parentId() {
        return parentId;
    }

    public CategoryName name() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(parentId, category.parentId) && Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, name);
    }
}
