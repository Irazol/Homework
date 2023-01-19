package Lesson12_13.Abstract;

public class Penguin extends Animal{
    @Override
    public void phylum() {
        System.out.println("Тип - хордові.");
    }

    @Override
    public void clas_s() {
        System.out.println("Клас - птахи.");
    }

    @Override
    public void habitat_area() {
        System.out.println("Область розповсюдження - поширені в холодних частинах південної півкулі.");
    }

    @Override
    public void move() {
        System.out.println("Спосіб пересування - ходять, плавають, не літають.");
    }
}
