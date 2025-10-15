package com.example.ecommerce.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class GoodsSalesDTO implements Serializable {
    private String name;
    private Integer number;
}
