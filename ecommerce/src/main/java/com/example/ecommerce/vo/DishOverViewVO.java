package com.example.ecommerce.vo;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Data
@Builder
public class DishOverViewVO implements Serializable {
    private Integer sold;
    private Integer discontinued;
}
