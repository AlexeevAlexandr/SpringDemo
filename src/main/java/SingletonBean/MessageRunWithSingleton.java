package SingletonBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageRunWithSingleton {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:message-bean.xml");

        Message message = (Message) context.getBean("printMessage");
        message.setMessage("This is first object");
        System.out.println(message.getMessage());

        Message message2 = (Message) context.getBean("printMessage");
        message2.setMessage("This is second object");
        System.out.println(message2.getMessage());

        Message message3 = (Message) context.getBean("printMessage");
        System.out.println(message3.getMessage());
    }
}
