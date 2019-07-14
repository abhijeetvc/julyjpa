package com.julyjpabatch.julyjpa.repository;

import com.julyjpabatch.julyjpa.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
