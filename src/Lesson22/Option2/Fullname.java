package Lesson22.Option2;


import java.io.Serializable;

public class Fullname implements Serializable {
    String first_name;
    String second_name;

    public Fullname(String first_name, String second_name) {
        this.first_name = first_name;
        this.second_name = second_name;
    }

    @Override
    public String toString() {
        return first_name + " "+ second_name;
    }
}
