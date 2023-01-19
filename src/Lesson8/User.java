package Lesson8;

public class User {
    int id;
    String name;
    String e_male;
    String phone;
    int age;

    public User(String name, String e_male, String phone, int age) {
        this.name = name;
        this.e_male = e_male;
        this.phone = phone;
        this.age = age;
    }

    public User(String name, String e_male, String phone) {        this.name = name;
        this.e_male = e_male;
        this.phone = phone;
    }

    public User() {
        this.age = 18;
    }

    public static void main(String[] args) {

        int count = 0;

        User first = new User("Ivan","lololo@gmail.com","0938546174",26);
        first.id=++count;

        User second = new User("Anna","hohoho@gmail.com","0938546175");
        second.id=++count;
        second.age = 31;

        User third = new User("Kate","hohoho@gmail.com","0938546176");
        third.id=++count;
        third.age = 35;

        User fourth = new User();
        fourth.id=++count;
        fourth.name = "Mark";
        fourth.e_male = "tututu@gmail.com";
        fourth.phone = "0938546177";

        User fifth = new User();
        fifth.id=++count;
        fifth.name = "Nick";
        fifth.e_male = "nonono@gmail.com";
        fifth.phone = "0938546178";
        fifth.age = 42;

        System.out.println("User № "+first.id+": name - "+first.name+ ", e-male: "+ first.e_male +
                ", phone number: "+first.phone+", age: "+first.age);
        System.out.println("User № "+second.id+": name - "+second.name+ ", e-male: "+ second.e_male +
                ", phone number: "+second.phone+", age: "+second.age);
        System.out.println("User № "+third.id+": name - "+third.name+ ", e-male: "+ third.e_male +
                ", phone number: "+third.phone+", age: "+third.age);
        System.out.println("User № "+fourth.id+": name - "+fourth.name+ ", e-male: "+ fourth.e_male +
                ", phone number: "+fourth.phone+", age: "+fourth.age);
        System.out.println("User № "+fifth.id+": name - "+fifth.name+ ", e-male: "+ fifth.e_male +
                ", phone number: "+fifth.phone+", age: "+fifth.age);
        }
}