package com.github.sreeharihegden.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;	
	
	public TrackCoach() {
		// Had to be added for MyApp.java which has a non-arg Constructor.
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Track Coach says: Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		
		return "Track Coach Fortune: " + fortuneService.getFortune();
	}

}
