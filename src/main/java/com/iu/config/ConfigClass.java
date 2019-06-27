package com.iu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.iu.phone.Galaxy;

@Configuration
public class ConfigClass {
	
	@Bean
	public Galaxy getGalaxy() {
		Galaxy galaxy = new Galaxy(200);
		galaxy.setColor("red");
		return galaxy;
	}

}
