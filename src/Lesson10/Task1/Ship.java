package Lesson10.Task1;

public class Ship extends Vehicle {
    private String port;
    private int number_of_passengers;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getNumber_of_passengers() {
        return number_of_passengers;
    }

    public void setNumber_of_passengers(int number_of_passengers) {
        this.number_of_passengers = number_of_passengers;
    }

    public Ship(String coordinates, int price, int speed, int year) {
        super(coordinates, price, speed, year);
    }
}
