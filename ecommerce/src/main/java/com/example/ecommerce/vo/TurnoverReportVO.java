package com.example.ecommerce.vo;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Data
@Builder
public class TurnoverReportVO implements Serializable {
    private String dateList;
    private String turnoverList;
}
