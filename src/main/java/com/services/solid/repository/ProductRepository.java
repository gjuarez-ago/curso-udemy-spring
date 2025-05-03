package com.services.solid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.solid.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
