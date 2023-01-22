package Lesson14.Enum1;

public enum Animals {
    GULL(20),
    ELEPHANT(50),
    WHALE(35),
    MOSQUITO(1),
    DUCK(1),
    HIPPO(20),
    TUNA(2);

    private int age;

    Animals(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return "Animal: " + super.toString()+ " "+getAge()+ " years old.";
    }
}
