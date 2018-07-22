package main.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Service.Coach;
import model.FootballCoach;
import model.GolfCoach;
import model.HockeyCoach;
import model.TennisCoach;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationConteiner.xml");
    	
    	Coach footballCoach = container.getBean("footballCoach", FootballCoach.class);
    	System.out.println(footballCoach.getDailyFortune());
    	System.out.println(footballCoach.getDailyWorkout());
    	
    	Coach hockeyCoach = container.getBean(HockeyCoach.class);
    	System.out.println(hockeyCoach.getDailyFortune());
    	System.out.println(hockeyCoach.getDailyWorkout());
    	
    	Coach tennisCoach = container.getBean(TennisCoach.class);
    	System.out.println(tennisCoach.getDailyFortune());
    	System.out.println(tennisCoach.getDailyWorkout());
    	
    	Coach golfCoach = container.getBean(GolfCoach.class);
    	System.out.println(golfCoach.getDailyFortune());
    	System.out.println(golfCoach.getDailyWorkout());
    	
    	
    	container.close();
    }
}
