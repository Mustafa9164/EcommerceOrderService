package com.app.tcs.EcommerceOrderService.dto;

import com.app.tcs.EcommerceOrderService.entity.OrderItem;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDTO {

    private long orderId;
    private Long userId;
    private List<OrderItem> items;}
