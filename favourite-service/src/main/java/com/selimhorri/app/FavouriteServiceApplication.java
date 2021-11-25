package com.selimhorri.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class FavouriteServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FavouriteServiceApplication.class, args);
	}
	
	
	
}

@RestController
class PaymentController {
	
	@GetMapping
	public String msg() {
		return "Favourite controller responding!!";
	}
	
}






