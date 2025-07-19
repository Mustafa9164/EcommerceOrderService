package com.app.tcs.EcommerceOrderService.repository;

import com.app.tcs.EcommerceOrderService.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}