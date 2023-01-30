package Lesson17.ex_004_comparable;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(195, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car c4 = new Car(200, 15000, "Porsche", "Green");
        Car c5 = new Car(180, 12000, "Ford", "Pink");
        Car[] c = {c1, c2, c3, c4, c5};

        Arrays.sort(c);
        System.out.println("Сортування за швидкістю");
        for (Car temp : c) {
            System.out.println(temp);
        }
        c1.speed = 100;
        c2.speed = 100;
        c3.speed = 100;
        c4.speed = 100;
        c5.speed = 100;

        Arrays.sort(c);
        System.out.println("\nСортування за ціною");
        for (Car temp : c) {
            System.out.println(temp);
        }

        c2.price = 8000;
        c3.price = 8000;
        c4.price = 8000;
        c5.price = 8000;

        Arrays.sort(c,new Car());
        System.out.println("\nСортування за моделю");
        for (Car temp : c) {
            System.out.println(temp);
        }

        c2.model= "BMW";
        c3.model= "BMW";
        c4.model= "BMW";
        c5.model= "BMW";

        Arrays.sort(c,new Car());
        System.out.println("\nСортування за коляром");
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
