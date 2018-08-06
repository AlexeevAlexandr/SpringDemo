package Spring.Annotations.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Position {
    @Autowired
    @Qualifier("javaDeveloper")
    private Developer developer;

    public Position(){}

    void getDevelopersInfo(){
        System.out.println(this.developer);
    }
}
