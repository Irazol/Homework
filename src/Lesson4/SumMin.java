package Lesson4;

import java.util.Scanner;
public class SumMin {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input first number A:");
            int a = input.nextInt();
            System.out.println("Input second number B(must be > A):");
            int b = input.nextInt();
            int total_sum =0;

            System.out.println("Unpaired numbers between " + a+ " and "+b+" :");
            for (int i = (a+1); i < b; i++) {
                total_sum+=i;
                if(i%2!=0)System.out.println(i);

            }System.out.println("Sum of numbers between "+ a+ " and "+b+" = " +total_sum );
        }
    }

