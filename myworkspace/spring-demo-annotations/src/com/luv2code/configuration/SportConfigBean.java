package com.luv2code.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import com.luv2code.springdemo.SadFortuneService;
import com.luv2code.springdemo.SwimCoach;

@Configuration
public class SportConfigBean {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach() {

		return new SwimCoach(sadFortuneService());
	}

}
