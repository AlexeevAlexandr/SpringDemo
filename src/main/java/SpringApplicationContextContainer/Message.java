package SpringApplicationContextContainer;
public class Message{
    String message;

    public String getMessage(){
        return "Message: " + message;
    }
    public void setMessage(String message){
        this.message = message;
    }
}