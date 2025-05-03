package com.services.solid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.services.solid.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}