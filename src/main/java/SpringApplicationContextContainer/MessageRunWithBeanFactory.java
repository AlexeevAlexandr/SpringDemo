package SpringApplicationContextContainer;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MessageRunWithBeanFactory {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext(
                "E:\\folder\\SpringDemoProject\\src\\main\\resources\\message-bean.xml");
        Message message = (Message) context.getBean("fromBeanMessage2");
        System.out.println(message.getMessage());
    }
}
