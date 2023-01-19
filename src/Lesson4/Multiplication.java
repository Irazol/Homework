package Lesson4;

import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some number in range 1-9, n:");
        int n = input.nextInt();

        if(n>0 && n<= 9) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + i * n + ";");
            }
        }
        else System.out.println("Number must be in range 1-9");
    }
}
