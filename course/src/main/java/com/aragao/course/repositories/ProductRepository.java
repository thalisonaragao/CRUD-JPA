package com.aragao.course.repositories;

import com.aragao.course.entities.Category;
import com.aragao.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
