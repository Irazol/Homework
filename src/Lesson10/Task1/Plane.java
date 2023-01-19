package Lesson10.Task1;

public class Plane extends Vehicle {
    public double height;
    public int number_of_passengers;

    public Plane(String coordinates, int price, int speed, int year, double height, int number_of_passengers) {
        super(coordinates, price, speed, year);
        this.height = height;
        this.number_of_passengers = number_of_passengers;
    }
}
