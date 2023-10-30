package com.xworkz.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.classes.Dussehra;

@Configuration
public class FestivalConfig {
	
	@Bean
	public Dussehra getDussehra() {
		return new Dussehra();
	}

}
