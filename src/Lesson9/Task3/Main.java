package Lesson9.Task3;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();

        address.setIndex(65000);
        address.setCountry("Zimbabwe");
        address.setCity("Harare");
        address.setStreet("Robert Mugabe Rd");
        address.setHouse("21 B");
        address.setApartment(12);

        System.out.println(address.getIndex() + ", " + address.getCountry() + ", " + address.getCity() +
                ", " + address.getStreet() + ", " + address.getHouse() + ", " + address.getApartment());

    }
}
