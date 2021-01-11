package com.github.sreeharihegden.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// Create a non-arg constructor as Spring will call it when they make a reference to our bean.
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor."); // Just some diagnostics.
	}
	
	// For Setter Dependency Injection, will be called by spring.
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService."); // Just some diagnostics.
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {		
		return "Cricket Coach Says: Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
