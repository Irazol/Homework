package Lesson4;

import java.util.Scanner;
public class Task3 {
       public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input some number n:");
            long n = input.nextLong();
            long a=1;

            while(n!=0){
                if(n%10>0)System.out.println(n%10*a);
                n/=10;
                a*=10;
            }
        }
    }
