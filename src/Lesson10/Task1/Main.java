package Lesson10.Task1;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane("2.3251461028898754, 114.495316242378",
                1000000, 250, 2020, 143.5, 550);

        Car car = new Car("45.97938941153117, -107.34062364601023", 20000, 120, 2019);

        Ship ship = new Ship("49.19778698257376, -123.20914428218944", 1020000, 80, 2015);
        ship.setPort("Vancouver");
        ship.setNumber_of_passengers(1200);

        System.out.println("Plane: " + plane.coordinates + " " + plane.price + " " + plane.speed + " " + plane.year +
                " " + plane.height + " " + plane.number_of_passengers);
        System.out.println("Car: " + car.coordinates + " " + car.price + " " + car.speed + " " + car.year);
        System.out.println("Ship: " + ship.coordinates + " " + ship.price + " " + ship.speed + " "
                + ship.price + " " + ship.getPort() + " " + ship.getNumber_of_passengers());
    }
}
