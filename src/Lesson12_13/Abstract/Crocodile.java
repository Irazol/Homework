package Lesson12_13.Abstract;

public class Crocodile extends Animal {

    @Override
    public void phylum() {
        System.out.println("Тип - хордові.");
    }

    @Override
    public void clas_s() {
        System.out.println("Клас - плазуни.");
    }

    @Override
    public void habitat_area() {
        System.out.println("Область розповсюдження - всі частини світу, крім Європи і Антарктиди.");
    }

    @Override
    public void move() {
        System.out.println("Спосіб пересування - повзають, плавають.");
    }
}
