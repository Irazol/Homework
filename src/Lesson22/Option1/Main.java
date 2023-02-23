package Lesson22.Option1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person(1,new Fullname("Tony","Stark"),42,"superhero",85.5);
        File file = new File("C:\\Users\\Іра\\Desktop\\Java\\Homework\\src\\Lesson22\\Option1","file.txt");
        System.out.println("Об'єкт до серіалізації:");
        System.out.println(person);
        ObjectOutputStream serialization = new ObjectOutputStream(new FileOutputStream(file));
        serialization.writeObject(person );
        serialization.flush();
        serialization.close();

        ObjectInputStream deserialization = new ObjectInputStream(new FileInputStream(file));
        Person newPerson = (Person)deserialization.readObject();
        deserialization.close();
        System.out.println("\nОб'єкт після серіалізації(будо виключенно поле Height):");
        System.out.println(newPerson);



    }
}
