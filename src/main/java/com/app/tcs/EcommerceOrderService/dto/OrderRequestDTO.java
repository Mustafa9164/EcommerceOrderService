package com.app.tcs.EcommerceOrderService.dto;

import com.app.tcs.EcommerceOrderService.entity.OrderItem;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDTO {
    private Long userId;
    private List<OrderItemDTO> items;
}
