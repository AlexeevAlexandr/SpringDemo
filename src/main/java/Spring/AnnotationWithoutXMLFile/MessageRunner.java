package Spring.AnnotationWithoutXMLFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MessageRunner {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
        Message message = context.getBean(Message.class);

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter message");
            String string = scanner.nextLine();
            message.setMessage(string);
            System.out.println(message);
        }catch(Exception e){e.printStackTrace();}
    }
}
