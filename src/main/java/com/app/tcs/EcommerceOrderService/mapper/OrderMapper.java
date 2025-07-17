package com.app.tcs.EcommerceOrderService.mapper;

import com.app.tcs.EcommerceOrderService.dto.CreateOrderResponseDTO;
import com.app.tcs.EcommerceOrderService.entity.Order;
import com.app.tcs.EcommerceOrderService.enums.OrderStatus;

public class OrderMapper {

    public static CreateOrderResponseDTO toCreateOrderResponseDTO(Order order){
        return CreateOrderResponseDTO.builder()
                        .orderId(order.getId())
                        .status(order.getStatus())
                        .build();
    }



}
