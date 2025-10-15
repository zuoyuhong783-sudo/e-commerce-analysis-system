package com.example.ecommerce.vo;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Data
@Builder
public class OrderReportVO implements Serializable {
    private String dateList;
    private String orderCountList;
    private String validOrderCountList;
    private Integer totalOrderCount;
    private Integer validOrderCount;
    private Double orderCompletionRate;
}
