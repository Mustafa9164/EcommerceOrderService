package com.app.tcs.EcommerceOrderService.service;

import com.app.tcs.EcommerceOrderService.dto.CreateOrderResponseDTO;
import com.app.tcs.EcommerceOrderService.dto.OrderRequestDTO;

import java.net.URI;

public interface IOrderService {
    CreateOrderResponseDTO createOrder(OrderRequestDTO request);
}
