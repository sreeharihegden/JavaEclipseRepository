package com.github.sreeharihegden.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "HappyFortuneService Fortune: Today is your lucky day!";
	}

}
