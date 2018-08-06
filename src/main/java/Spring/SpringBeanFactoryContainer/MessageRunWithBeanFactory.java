package Spring.SpringBeanFactoryContainer;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MessageRunWithBeanFactory {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Spring/message-bean.xml"));
        Message message = (Message) factory.getBean("fromBeanMessage1");
        System.out.println(message.getMessage());
    }
}
