package com.github.sreeharihegden.springdemo;

public class BaseballCoach implements Coach{
	
	// Define a private field for injecting the dependency.
	private FortuneService fortuneservice;
	
	// Define a constructor for Constructor Dependency Injection.
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneservice = theFortuneService;		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Baseball Coach says: Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// Use my FortuneService to get a fortune
		return fortuneservice.getFortune();
	}
}
