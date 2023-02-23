package Lesson22.Option1;

import java.io.Serializable;

public class Person implements Serializable {
    int id;
    Fullname fullname;
    int age;
    String specialty;
    transient double height;

    public Person(int id, Fullname fullname, int age, String specialty, double height) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.specialty = specialty;
        this.height = height;
    }

    @Override
    public String toString() {
        return  "id: " + id +
                "\nFullname: "  + fullname +
                "\nAge: " + age +
                "\nSpecialty: '" + specialty + '\'' +
                "\nHeight: " + height;
    }
}
