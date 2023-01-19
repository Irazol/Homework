/*Мінус такого спобосу пошуку факторіала напевно в тому, треба здійстини більше операцій,
відповідно программа працює не так швидко */

package Lesson6;

import java.util.Scanner;
public class Factorial {
    static int fact(int n){
        int res = 0;
        if(n==1) return 1;
        res = (fact(n-1))*n;
        return res;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input some number:");
        int n = input.nextInt();
        System.out.println(n+ "! = "+ fact(n));
        }
    }

