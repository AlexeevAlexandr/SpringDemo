package Spring.BeanPostProcessorDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageWithBeanPostProcessor {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:Spring/message-bean.xml");
        Message message = (Message) context.getBean("message6");
        System.out.println(message.getMessage());
        context.registerShutdownHook();
    }
}
