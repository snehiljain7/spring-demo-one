package com.learning.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields
	private String emailAddress;
	private String team;
	
	//create a no-arg constructor
	public CricketCoach() {
       
		System.out.println("Cricket coach inside no-arg constructor");
	}
	 

	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach inside setter method");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach inside setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		System.out.println("Cricket coach inside setTeam");
		this.team = team;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}
	

}
