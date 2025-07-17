package com.app.tcs.EcommerceOrderService.service;

import com.app.tcs.EcommerceOrderService.clients.ProductServiceClient;
import com.app.tcs.EcommerceOrderService.dto.CreateOrderResponseDTO;
import com.app.tcs.EcommerceOrderService.dto.OrderItemDTO;
import com.app.tcs.EcommerceOrderService.dto.OrderRequestDTO;
import com.app.tcs.EcommerceOrderService.dto.ProductDTO;
import com.app.tcs.EcommerceOrderService.entity.Order;
import com.app.tcs.EcommerceOrderService.entity.OrderItem;
import com.app.tcs.EcommerceOrderService.enums.OrderStatus;
import com.app.tcs.EcommerceOrderService.mapper.OrderItemMapper;
import com.app.tcs.EcommerceOrderService.mapper.OrderMapper;
import com.app.tcs.EcommerceOrderService.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements  IOrderService{

    private final OrderRepository orderRepository;
    private final ProductServiceClient productServiceClient;

    private OrderService(OrderRepository orderRepository, ProductServiceClient productServiceClient){
        this.orderRepository=orderRepository;
        this.productServiceClient = productServiceClient;
    }

    @Override
    public CreateOrderResponseDTO createOrder(OrderRequestDTO request) {

        Order order=new Order();
        order.setUserId(request.getUserId());
        order.setStatus(OrderStatus.PENDING);

        List<OrderItem> alItems=new ArrayList<>();

        for(OrderItemDTO itemDTO: request.getItems()){
            ProductDTO product = ProductServiceClient.getProductById(itemDTO.getProductId());
            double pricePerUnit = product.getPrice();
            double totalPrice = pricePerUnit * itemDTO.getQuantity();

            OrderItem item = OrderItemMapper.toEntity(itemDTO, order, pricePerUnit, totalPrice);
            alItems.add(item);


        }
    order.setItems(alItems);

        Order createdOrder  = orderRepository.save(order);
        return  OrderMapper.toCreateOrderResponseDTO(createdOrder);
    }



}
