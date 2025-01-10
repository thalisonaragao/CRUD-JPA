package com.aragao.course.repositories;

import com.aragao.course.entities.Order;
import com.aragao.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
