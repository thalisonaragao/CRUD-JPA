package com.aragao.course.repositories;

import com.aragao.course.entities.Category;
import com.aragao.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
