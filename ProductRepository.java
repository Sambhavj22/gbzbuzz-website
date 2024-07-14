package com.gbjbuzz.repository;

import com.gbjbuzz.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
