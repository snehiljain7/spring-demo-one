package com.learning.springdemo;

public class TrackCoach implements Coach {

	
	//define a private field for the dependency
		private FortuneService fortuneService;
		
		//define a constructor for dependency injection
		public TrackCoach(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}
		
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
