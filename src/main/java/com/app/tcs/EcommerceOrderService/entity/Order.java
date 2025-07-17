package com.app.tcs.EcommerceOrderService.entity;

import com.app.tcs.EcommerceOrderService.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "`order`")
public class Order extends BaseEntity {

    private Long userId;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "order")
    private List<OrderItem> items;

}