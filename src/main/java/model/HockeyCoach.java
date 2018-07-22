package model;

import Service.Coach;
import Service.FortuneService;

public class HockeyCoach implements Coach {

	private FortuneService fs;

	public HockeyCoach(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "keep calm and play hard";
	}

	@Override
	public String getDailyFortune() {
		return "come on!" + fs.getFortune();
	}

}
