package EventHandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class MyStartEventHandler implements ApplicationListener {
    public void onApplicationEvent(ContextStartedEvent event){
        System.out.println("We've received ContextStartedEvent...");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

    }
}