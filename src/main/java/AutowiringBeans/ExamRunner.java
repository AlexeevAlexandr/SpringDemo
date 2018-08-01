package AutowiringBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring-by-name-config.xml");
        Exam exam = (Exam) context.getBean("exam");
        exam.examCheck();
    }
}
