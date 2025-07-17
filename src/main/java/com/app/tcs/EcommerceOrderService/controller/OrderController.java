package com.app.tcs.EcommerceOrderService.controller;

import com.app.tcs.EcommerceOrderService.dto.CreateOrderResponseDTO;
import com.app.tcs.EcommerceOrderService.dto.OrderDTO;
import com.app.tcs.EcommerceOrderService.dto.OrderRequestDTO;
import com.app.tcs.EcommerceOrderService.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private final IOrderService orderService;

    OrderController(IOrderService orderService){
        this.orderService=orderService;
    }

    @PostMapping
    public ResponseEntity<CreateOrderResponseDTO> createOrder(@RequestBody OrderRequestDTO request){
        CreateOrderResponseDTO order = orderService.createOrder(request);
        return ResponseEntity.ok(order);
    }
}
