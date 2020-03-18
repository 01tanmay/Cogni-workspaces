package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.configuration.SportConfigBean;

public class JavaConfigDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfigBean.class);

		Coach coach = context.getBean("swimCoach", Coach.class);

		System.out.println(coach.dailyWorkout());

		System.out.println(coach.getDailyFortune());

		context.close();

	}

}