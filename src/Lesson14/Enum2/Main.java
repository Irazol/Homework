package Lesson14.Enum2;

public class Main {
    public static void main(String[] args) {

        Vehicles vehicles1 = Vehicles.BMW;
        vehicles1.setColor("black");
        System.out.println(vehicles1);

        Vehicles vehicles2 = Vehicles.FORD;
        vehicles2.setColor("green");
        System.out.println(vehicles2);

        Vehicles vehicles3 = Vehicles.MERCEDES;
        vehicles3.setColor("red");
        System.out.println(vehicles3);

        Vehicles vehicles4 = Vehicles.LEXUS;
        vehicles4.setColor("white");
        System.out.println(vehicles4);

        Vehicles vehicles5 = Vehicles.TESLA;
        vehicles5.setColor("grey");
        System.out.println(vehicles5);

        Vehicles vehicles6 = Vehicles.BENTLEY;
        vehicles6.setColor("yellow");
        System.out.println(vehicles6);

        Vehicles vehicles7 = Vehicles.VOLKSWAGEN;
        vehicles7.setColor("white");
        System.out.println(vehicles7);

    }
}
