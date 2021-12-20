package com.mhsong.paasdbconntest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PaasdbConnTestApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PaasdbConnTestApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PaasdbConnTestApplication.class, args);
	}

}
