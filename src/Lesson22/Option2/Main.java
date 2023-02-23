package Lesson22.Option2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person(1,new Fullname("Stephen","Hawking"),76,"scientist");
        ObjectOutputStream  serialization = new ObjectOutputStream(new FileOutputStream
                ("C:\\Users\\Іра\\Desktop\\Java\\Homework\\src\\Lesson22\\Option2\\text.txt"));
        serialization.writeObject(person);
        serialization.flush();
        serialization.close();

        ObjectInputStream  deserialization = new ObjectInputStream(new FileInputStream
                ("C:\\Users\\Іра\\Desktop\\Java\\Homework\\src\\Lesson22\\Option2\\text.txt"));
        Person newPerson = (Person)deserialization.readObject();
        System.out.println(newPerson);
    }
}
