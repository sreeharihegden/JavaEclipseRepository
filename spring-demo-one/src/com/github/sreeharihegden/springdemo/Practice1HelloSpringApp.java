package com.github.sreeharihegden.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice1HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the Spring Configuration File. 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); // This XML file can have any name.
		
		// Retrieve Bean from Spring Container aka Application Context.
		Coach theCoach1 = context.getBean("myCoach", Coach.class);
		Coach theCoach2 = context.getBean("myGolfCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());

		// Close the Context.
		context.close(); // clean up.
	}

}
