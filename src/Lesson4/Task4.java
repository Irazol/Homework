package Lesson4;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some number n:");
        int n = input.nextInt();
        int i = 0;

            while(i<n){
                for (int j = 0; j <= i ; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            i++;
        }
    }
}

