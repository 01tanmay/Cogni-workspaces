package com.luv2code.springdemo;

//@Component("swimmer")
public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String dailyWorkout() {
		return "do 5 laps";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
