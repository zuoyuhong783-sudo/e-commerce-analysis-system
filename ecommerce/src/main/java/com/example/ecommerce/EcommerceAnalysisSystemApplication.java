package com.example.ecommerce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ecommerce.mapper")
public class EcommerceAnalysisSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAnalysisSystemApplication.class, args);
	}

}
