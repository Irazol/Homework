package Lesson14.Enum2;

public enum Vehicles {
    BMW(2020, ""),
    FORD(2021, ""),
    MERCEDES(2019,""),
    LEXUS(2020,""),
    TESLA(2018,""),
    BENTLEY(2019,""),
    VOLKSWAGEN(2020,"");

    private final int year;
    private String color;

    Vehicles(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        return "Vehicles: " + super.toString()+ " released in "+getYear()+ ", color - "+getColor()+ ";" ;
    }
}
