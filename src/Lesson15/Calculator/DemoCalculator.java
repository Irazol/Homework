package Lesson15.Calculator;

import java.util.Scanner;
public class DemoCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some two number");
        double a = input.nextDouble();
        double b = input.nextDouble();

        Calculate  calculate = new  Calculate(a,b) ;
        calculate.addition();
        calculate.subtraction();
        calculate.multiplication();
        calculate.division();
        calculate.sqrt();
        calculate.exponentiates();
    }
}
