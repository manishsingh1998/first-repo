package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	//add new fields for team name
	private String team;
	
	
	//add new fields for Captain name
	private String captain;
	
	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method-setTeam");
		this.team = team;
	}


	public String getCaptain() {
		return captain;
	}


	public void setCaptain(String captain) {
		System.out.println("CricketCoach: inside setter method-setCaptain");
		this.captain = captain;
	}

	private FortuneService fortuneService;

	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg Constructor");
	}

	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method-setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
	
		return "Practice Spin Bowling for 20 mins";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
