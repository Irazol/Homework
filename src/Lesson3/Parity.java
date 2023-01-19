package Lesson3;

import java.util.Scanner;
public class Parity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some number n:");
        int n = input.nextInt();

        if(n/2==(double)n/2) System.out.println("Number " + n+ " is paired");
        else System.out.println("Number " + n+ " is not paired");
    }
}
