package com.aragao.course.repositories;

import com.aragao.course.entities.Order;
import com.aragao.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
