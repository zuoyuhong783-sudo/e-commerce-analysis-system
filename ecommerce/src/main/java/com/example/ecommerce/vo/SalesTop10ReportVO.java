package com.example.ecommerce.vo;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Data
@Builder
public class SalesTop10ReportVO implements Serializable {
    private String nameList;
    private String numberList;
}
