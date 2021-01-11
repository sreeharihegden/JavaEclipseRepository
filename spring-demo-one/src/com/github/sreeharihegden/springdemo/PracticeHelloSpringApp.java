package com.github.sreeharihegden.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		
		// Load the Spring Configuration File. 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); // This XML file can have any name.
		
		// Retrieve Bean from Spring Container aka Application Context.
		// Coach theCoach1 = context.getBean("myCoach", Coach.class);
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune()); // Check why its output gives Diagnostics from CricketCoach no-arg constructor and setters?

		// Close the Context.
		context.close(); // clean up.
	}

}
