package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("sillyCoach", Coach.class);

		System.out.println(coach.dailyWorkout());

		System.out.println(coach.getDailyFortune());

		context.close();

	}

}
