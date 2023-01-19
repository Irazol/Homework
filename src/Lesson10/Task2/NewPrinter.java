package Lesson10.Task2;

public class NewPrinter extends Printer {
    public static void show() {
        System.out.println((char) 27 + "[32m" + "Hewlett-Packard");
    }
}
