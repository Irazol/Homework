package Lesson17.ex_004_comparable;

import java.util.Comparator;

public class Car implements Comparable, Comparator {
    int speed;
    int price;
    String model;
    String color;

    public Car() {
    }

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car)o).speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            return this.price - ((Car)o).price;
        } else {
            return temp;
        }
    }


    @Override
    public int compare(Object o1, Object o2) {
        if (((Car)o1).model.equals(((Car)o2).model) == true){
            return ((Car)o1).color.compareTo(((Car)o2).color);
        }
        else
            return ((Car)o1).model.compareTo(((Car)o2).model);
    }
}
