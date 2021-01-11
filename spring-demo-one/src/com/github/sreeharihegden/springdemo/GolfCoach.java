package com.github.sreeharihegden.springdemo;

public class GolfCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "GolfCoach says Practice your putting skills for 2 hours today.";
	}

}
