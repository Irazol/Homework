package Lesson3;

import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some number in range [0-100] n:");
        double n = input.nextDouble();

        if (n >= 0 && n <= 14) System.out.println("Number " + n + " in range  [0 - 14]");
        else if (n > 14 && n <= 35) System.out.println("Number " + n + " in range  [15 - 35]");
        else if (n > 35 && n <= 50) System.out.println("Number " + n + " in range  [36 - 50]");
        else if (n > 50 && n <= 100) System.out.println("Number " + n + " in range  [50 - 100]");
        else System.out.println("Number n is not in range [0-100]");
    }
}
