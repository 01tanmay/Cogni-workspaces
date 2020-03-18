package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String email;
	private String team;

	public void setEmail(String email) {
		this.email = email;
		System.out.println("Inside email setter method !! " + email);
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("Inside team setter method !! " + team);
	}

	// setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside fortune setter method");
	}

	// constructor injection
	/*
	 * public CricketCoach(FortuneService fortuneService) { super();
	 * this.fortuneService = fortuneService; }
	 */

	public CricketCoach() {
		System.out.println("Inside no-arg Constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Watch videos of Indian cricket team";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
