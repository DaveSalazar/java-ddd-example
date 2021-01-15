package com.prueba.administration.categories.domain;

import com.prueba.administration.shared.domain.CategoryId;
import com.prueba.shared.domain.criteria.Criteria;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {

    void save(Category data);
    Optional<Category> search(CategoryId id);
    List<Category> searchAll();
    List<Category> matching(Criteria criteria);
}
