package Annotations.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Developer {
    private String name;
    private Integer experience;
    private String specialty;

    @Autowired
    public Developer (String name, Integer experience, String specialty){
        this.name = name;
        this.experience = experience;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public Integer getExperience() {
        return experience;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString(){
        return "Developer info:\n" +
                "name: " + name + ";\n" +
                "Experience: " + experience + " years;\n" +
                "Specialty: " + specialty + ";";
    }
}
