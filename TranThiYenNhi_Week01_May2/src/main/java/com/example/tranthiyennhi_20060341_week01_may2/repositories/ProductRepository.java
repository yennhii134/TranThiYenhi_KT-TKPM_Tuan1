package com.example.tranthiyennhi_20060341_week01_may2.repositories;

import com.example.tranthiyennhi_20060341_week01_may2.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
