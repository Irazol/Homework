package Lesson12_13.Abstract;

public class Main {
    public static void main(String[] args) {

        Crocodile crocodile = new Crocodile();
        crocodile.weight = 200;
        crocodile.name = "Крокодил";
        crocodile.animal_name();
        crocodile.animal_weight();
        crocodile.phylum();
        crocodile.clas_s();
        crocodile.habitat_area();
        crocodile.move();
        System.out.println("");

        Penguin penguin = new Penguin();
        penguin.weight = 20;
        penguin.name = "Пінгвін";
        penguin.animal_name();
        penguin.animal_weight();
        penguin.phylum();
        penguin.clas_s();
        penguin.habitat_area();
        penguin.move();
        System.out.println("");

        Polarbear polarbear = new Polarbear();
        polarbear.weight = 250;
        polarbear.name = "Білий ведьмідь";
        polarbear.animal_name();
        polarbear.animal_weight();
        polarbear.phylum();
        polarbear.clas_s();
        polarbear.habitat_area();
        polarbear.move();

    }
}
