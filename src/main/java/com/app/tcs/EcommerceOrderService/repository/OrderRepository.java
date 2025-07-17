package com.app.tcs.EcommerceOrderService.repository;

import com.app.tcs.EcommerceOrderService.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}