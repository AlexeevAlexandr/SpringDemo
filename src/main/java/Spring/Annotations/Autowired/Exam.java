package Spring.Annotations.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Exam {
    private AnswerChecker answerChecker;

    @Autowired
    public Exam(AnswerChecker answerChecker){
        this.answerChecker = answerChecker;
    }

    public AnswerChecker getAnswerChecker(){
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We've just ser answerChecker using setter");
    }

    public void examCheck(){
        answerChecker.checkAnswer();
    }
}
