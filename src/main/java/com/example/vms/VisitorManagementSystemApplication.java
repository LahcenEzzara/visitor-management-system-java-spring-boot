package com.example.vms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication
public class VisitorManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisitorManagementSystemApplication.class, args);
	}
	
	@Bean
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
	    return new HiddenHttpMethodFilter();
	}


}
