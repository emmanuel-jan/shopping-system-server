package com.jantech.shoppingsystemserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@SpringBootApplication
public class ShoppingSystemServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingSystemServerApplication.class, args);
	}


	//cros configuration
	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/**")
						.allowedOrigins("*")
						.allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH")
						.exposedHeaders("*");
			}
		};
	}

}
