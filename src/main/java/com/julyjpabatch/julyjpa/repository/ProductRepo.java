package com.julyjpabatch.julyjpa.repository;

import com.julyjpabatch.julyjpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
