package Annotations.Required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Developer {
    private String name;
    private Integer experience;
    private String specialty;

    public String getName(){
        return name;
    }

    @Required
    public void setName(String name){
        this.name = name;
    }

    public String getSpecialty(){
        return specialty;
    }

    @Required
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    public Integer getExperience(){
        return experience;
    }

    @Required
    public void setExperience(Integer experience){
        this.experience = experience;
    }

    @Override
    public String toString(){
        return "Developer info:\n" +
                "Name: " + name + "\n" +
                "Experience: " + experience + "\n" +
                "Specialty: " + specialty;
    }
}
