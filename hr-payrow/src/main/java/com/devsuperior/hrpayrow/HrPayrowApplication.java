package com.devsuperior.hrpayrow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrPayrowApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayrowApplication.class, args);
	}

}
