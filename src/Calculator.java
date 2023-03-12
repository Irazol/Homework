package Lesson24_25.Lambda;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mathematical operation:" +
                "\n + addition;" +
                "\n - subtraction; "+
                "\n * multiplication; "+
                "\n / division");
        String sign = input.nextLine();
        System.out.println("Input some two number");
        double a = input.nextDouble();
        double b = input.nextDouble();

        switch ( sign ) {
            case ("+"):
                Addition addition =  ( c, d) -> a + b;
                System.out.println("Addition: " + a + " + " + b + " = " + addition.addition(a,b));
                break;
            case ("-"):
                Subtraction subtraction = ( c, d) -> a - b;
                System.out.println("Addition: " + a + " + " + b + " = " + subtraction.subtraction(a,b));
                break;
            case ("*"):
                Multiplication multiplication = ( c, d) -> a * b;
                System.out.println("Addition: " + a + " + " + b + " = " + multiplication.multiplication (a,b));
                break;
            case ("/"):
                Division division = ( c, d) -> a / b;
                System.out.println("Addition: " + a + " + " + b + " = " + division.division(a,b));
                break;
            default:
                System.out.println("Wrong mathematical sign ");
                break;
        }
    }
}
