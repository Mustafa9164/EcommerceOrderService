package com.app.tcs.EcommerceOrderService.mapper;

import com.app.tcs.EcommerceOrderService.dto.OrderItemDTO;
import com.app.tcs.EcommerceOrderService.entity.Order;
import com.app.tcs.EcommerceOrderService.entity.OrderItem;

public class OrderItemMapper {

    public static OrderItem toEntity(OrderItemDTO orderItemDTO, Order order, double pricePerUnit, double totalPrice){
        return OrderItem.builder()
                .productId(orderItemDTO.getProductId())
                .quantity(orderItemDTO.getQuantity())
                .order(order)
                .pricePerUnit(pricePerUnit)
                .totalPrice(totalPrice)
                .build();
    }
}
