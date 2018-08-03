package EventHandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class MyStopEventHandler implements ApplicationListener {
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("We've received ContextStoppedEvent...");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

    }
}
