package Lesson21.Task1;

import java.io.Serializable;

public class Candidate extends People implements Serializable,Cloneable {
    private int id;
    public String name;
    private int age;
    public String position;
    public double experience;

    public Candidate() {
    }

    public Candidate(int id, String name, int age, String position, double experience) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }


    public String getJob(String str){
        if(str.equals("No")){
            return ("Sorry, but we have to refuse you.");
        }
        else return ("Congratulations, you get this job!");
    }
}
