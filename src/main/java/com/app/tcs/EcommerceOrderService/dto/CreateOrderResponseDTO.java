package com.app.tcs.EcommerceOrderService.dto;

import com.app.tcs.EcommerceOrderService.enums.OrderStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderResponseDTO {
    private Long orderId;
    private OrderStatus status;
}
