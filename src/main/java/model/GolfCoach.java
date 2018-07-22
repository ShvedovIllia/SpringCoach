package model;

import Service.Coach;
import Service.FortuneService;

public class GolfCoach implements Coach {

	private FortuneService fs;

	public GolfCoach(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "keep calm and play hard";
	}

	@Override
	public String getDailyFortune() {
		return "looooooser! " + fs.getFortune();
	}

}
