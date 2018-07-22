package model;

import Service.Coach;
import Service.FortuneService;

public class TennisCoach implements Coach {

	private FortuneService fs;
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void setFs(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Make serve away 2 hours";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return name + "Good job" + fs.getFortune();
	}

}
