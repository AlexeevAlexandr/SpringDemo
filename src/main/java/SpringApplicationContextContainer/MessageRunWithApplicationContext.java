package SpringApplicationContextContainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageRunWithApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext(
                "E:\\projects IJ\\SpringDemo\\SpringDemo\\src\\main\\resources\\message-bean.xml");
        Message message = (Message) context.getBean("fromBeanMessage2");
        System.out.println(message.getMessage());
    }
}
