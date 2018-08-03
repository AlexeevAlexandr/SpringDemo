package AnnotationWithoutXMLFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MessageRunner {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
        Message message = context.getBean(Message.class);

        try(Scanner scanner = new Scanner(System.in)) {
            message.setMessage("This is simple message");
            System.out.println(message);
        }catch(Exception e){e.printStackTrace();}
    }
}
