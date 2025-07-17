package com.app.tcs.EcommerceOrderService.dto;

import com.app.tcs.EcommerceOrderService.entity.Order;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItemDTO {

    private Long productId;
    private int quantity;
    private int categoryId;
}