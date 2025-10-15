package com.example.ecommerce.vo;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Data
@Builder
public class UserReportVO implements Serializable {
    private String dateList;
    private String totalUserList;
    private String newUserList;
}
