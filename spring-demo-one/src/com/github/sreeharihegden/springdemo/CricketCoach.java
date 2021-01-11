package com.github.sreeharihegden.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// Add new fields for Injecting Literal Values.
	private String emailAddress;
	private String team;
	
	// Create a non-arg constructor as Spring will call it when they make a reference to our bean.
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor."); // Just some diagnostics.
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress."); // Just some diagnostics.
		this.emailAddress = emailAddress;
	}
	
	public String getTeam() {		
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam."); // Just some diagnostics.
		this.team = team;
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
