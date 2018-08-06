package Spring.EventHandling.OwnEventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyEventRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spring/my-event-config.xml");

        MyEventPublisher myEventPublisher = (MyEventPublisher) context.getBean("myEventPublisher");
        myEventPublisher.publishEvent();
    }
}

