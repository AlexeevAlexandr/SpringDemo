package Spring.Annotations.JSR_250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
    private String message;

    public String getMessage(){
        return "Message: " + message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    @PostConstruct
    public void beanInit(){
        System.out.println("Bean is passed init stage");
    }

    @PreDestroy
    public void beanDestroy(){
        System.out.println("Bean is passing destroy stage");
    }
}
