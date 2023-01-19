package Lesson12_13.Abstract;

public abstract class Animal {
    String name;
    int weight;

    public abstract void phylum();
    public abstract void clas_s();
    public abstract void habitat_area();
    public abstract void move();

    public void animal_name() {
        System.out.println(name);
    }

    public void animal_weight() {
        System.out.println("Вага тварини - "+ weight);
    }
}
