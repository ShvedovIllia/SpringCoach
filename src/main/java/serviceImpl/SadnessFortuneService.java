package serviceImpl;

import Service.FortuneService;

public class SadnessFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Your bad day!";
	}

}
