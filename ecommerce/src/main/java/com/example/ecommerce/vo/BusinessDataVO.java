package com.example.ecommerce.vo;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Data
@Builder
public class BusinessDataVO implements Serializable {
    private Double turnover; // 营业额
    private Integer validOrderCount; // 有效订单数
    private Double orderCompletionRate; // 订单完成率
    private Double unitPrice; // 平均客单价
    private Integer newUsers; // 新增用户数
}
