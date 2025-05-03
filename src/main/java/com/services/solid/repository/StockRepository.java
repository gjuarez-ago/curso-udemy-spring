package com.services.solid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.solid.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
