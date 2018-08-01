package CollectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection-injection-config.xml");
        CollectionInjection collectionInjection = (CollectionInjection) context.getBean("collectionInjection");
        collectionInjection.getList();
        collectionInjection.getSet();
        collectionInjection.getMap();
        collectionInjection.getProperties();
    }
}
