package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach baseballCoach=context.getBean("myCoach",Coach.class);
        //Coach baseballCoach=new TrackCoach();
        System.out.println(baseballCoach.getDailyWorkOut());
    }
}
