package model;

import Service.Coach;

public class FootballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Run away 40 minutes!";
	}

	@Override
	public String getDailyFortune() {
		return "it`s your lucky day today";
	}

}
