package Lesson22.Option2;

import java.io.*;

public class Person implements Serializable  {
    int id;
    Fullname fullname;
    int age;
    String specialty;


    public Person(int id, Fullname fullname, int age, String specialty) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.specialty = specialty;

    }
    @Serial
    private void writeObject(ObjectOutputStream serialization) {
        try {
            serialization.defaultWriteObject();

            serialization.writeObject(fullname.first_name);
            serialization.writeObject(fullname.second_name);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Serial
    private void readObject (ObjectInputStream deserialization ) {
        try {
            deserialization .defaultReadObject();

            this.fullname= new Fullname((String)deserialization.readObject(),
                    (String) deserialization .readObject());

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return  "id: " + id +
                "\nFullname: "  + fullname +
                "\nAge: " + age +
                "\nSpecialty: '" + specialty + '\'';
    }
}
