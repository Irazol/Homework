package Lesson15.Trycatch;

public class First {
    public static void main(String[] args) {
        int a = 1;

        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            System.out.println("Арифметична помилка - ділення на нуль");
        }
    }
}
