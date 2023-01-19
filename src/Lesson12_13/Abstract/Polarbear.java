package Lesson12_13.Abstract;

public class Polarbear extends Animal{
    @Override
    public void phylum() {
        System.out.println("Тип - хордові.");
    }

    @Override
    public void clas_s() {
        System.out.println("Клас - ссавці.");
    }

    @Override
    public void habitat_area() {
        System.out.println("Область розповсюдження - поширені у Північному Льодовитому океані та на його узбережжях.");
    }

    @Override
    public void move() {
        System.out.println("Спосіб пересування -  ходять, плавають.");
    }
}
