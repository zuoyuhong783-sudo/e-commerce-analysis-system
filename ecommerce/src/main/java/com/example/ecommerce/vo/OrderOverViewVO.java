package com.example.ecommerce.vo;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Data
@Builder
public class OrderOverViewVO implements Serializable {
    private Integer waitingOrders;
    private Integer deliveredOrders;
    private Integer completedOrders;
    private Integer cancelledOrders;
    private Integer allOrders;
}
