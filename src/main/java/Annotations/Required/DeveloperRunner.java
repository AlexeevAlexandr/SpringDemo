package Annotations.Required;

import Annotations.Required.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-required-config.xml");
        Developer developer = (Developer) context.getBean("developer");
        System.out.println(developer);
    }
}
