package PrototypeBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageRunWithSingleton {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:message-bean.xml");

        Message message = (Message) context.getBean("printMessage4");
        message.setMessage("This is first object");
        System.out.println(message.getMessage());

        Message message2 = (Message) context.getBean("printMessage4");
        System.out.println(message2.getMessage());
    }
}
