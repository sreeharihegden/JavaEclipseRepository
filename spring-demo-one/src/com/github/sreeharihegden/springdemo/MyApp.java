package com.github.sreeharihegden.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// Create the object.
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach(); // This is still hard-coded, Spring App. should be configurable!

		// Use the object.
		System.out.println(theCoach.getDailyWorkout());

	}

}
