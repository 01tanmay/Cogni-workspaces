package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;

	//constructor injection
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Watch manchester United Videos";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
