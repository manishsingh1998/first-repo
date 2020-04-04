package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService thefortuneService) {
	
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Lets do it :" + fortuneService.getFortune();
	}

}
