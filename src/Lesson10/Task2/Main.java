package Lesson10.Task2;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.show();

        NewPrinter newprinter = new NewPrinter();
        newprinter.show();

        Printer printerUp = newprinter;
        printerUp.show();

        Printer printerDown = newprinter;
        ((NewPrinter) printerDown).show();


    }
}

