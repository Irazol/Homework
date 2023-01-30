package Lesson16.Option1;

import Lesson16.Option1.Calculator;

import java.util.Scanner;

public class DemoCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some two number");
        try {
            double a = input.nextDouble();
            double b = input.nextDouble();

            if (a == (int) a && b == (int) b) {
                Calculator<Integer> calculator = new Calculator<>();
                System.out.println(calculator.addition((int) a, (int) b));
                System.out.println(calculator.subtraction((int) a, (int) b));
                System.out.println(calculator.multiplication((int) a, (int) b));
                System.out.println(calculator.division((int) a, (int) b));
                System.out.println(calculator.exponentiation((int) a, (int) b));
            } else {
                Calculator<Double> calculator2 = new Calculator<>();
                System.out.println(calculator2.addition(a, b));
                System.out.println(calculator2.subtraction(a, b));
                System.out.println(calculator2.multiplication(a, b));
                System.out.println(calculator2.division(a, b));
                System.out.println(calculator2.exponentiation(a, b));
            }
        }
        catch (Exception e){
            System.out.println("Input error.Input some two number. Enter a fractional number in the format 1,2(,)");
        }
    }
}

