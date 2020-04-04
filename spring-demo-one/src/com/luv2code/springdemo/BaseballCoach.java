package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService thefortuneService)
	{
		fortuneService=thefortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		 return "spend 30 minutes on batting practice ";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune() ;
	}

	
}  
