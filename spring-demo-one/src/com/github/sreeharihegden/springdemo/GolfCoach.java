package com.github.sreeharihegden.springdemo;

public class GolfCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Golf Coach says: Practice your putting skills for 2 hours today.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
