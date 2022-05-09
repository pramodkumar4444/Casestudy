package io.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

public class DealsAndCouponsMicroServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DealsAndCouponsMicroServiceApplication.class, args);
	}


}
