package com.github.sreeharihegden.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	// Create an array of strings.
	private String[] fortunes = {
			"Fortune 1",
			"Fortune 2",
			"Fortune 3"			
	};
	
	// Create a Random Number Generator.
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// Pick a random string from the array.
		int index = myRandom.nextInt(fortunes.length);
		String theFortune = fortunes[index];
		return theFortune;
	}
}
