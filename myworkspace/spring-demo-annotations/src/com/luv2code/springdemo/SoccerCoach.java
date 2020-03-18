package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sillyCoach")
public class SoccerCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneSevice;

	/*
	 * @Autowired public void setFortuneSevice(FortuneService fortuneSevice) {
	 * System.out.println("Inside setter"); this.fortuneSevice = fortuneSevice; }
	 */

	@Override
	public String dailyWorkout() {
		return "Watch united videos";
	}

	@Override
	public String getDailyFortune() {
		return fortuneSevice.getFortune();
	}

	public SoccerCoach(FortuneService fortuneSevice) {
		System.out.println("Inside no-arg constructor");
		this.fortuneSevice = fortuneSevice;
	}

	public SoccerCoach() {
		super();
	}

	/*
	 * public SoccerCoach(FortuneService fortuneSevice, String s) {
	 * this.fortuneSevice = fortuneSevice; }
	 */

}
