package com.learning.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coach theCoach = new TrackCoach(new HappyFortuneService());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}

}
