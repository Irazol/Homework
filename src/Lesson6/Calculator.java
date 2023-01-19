/*Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate,
 який приймає як параметри три цілочислові значення та повертає значення кожного аргументу, поділеного на 5.*/

package Lesson6;
import java.util.Scanner;

public class Calculator {
    static void calculate(int a, int b, int c) {
        System.out.println((double)a/5+ " "+(double)b/5+" "+(double)c/5);
    };

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input some tree numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

       calculate(a,b,c);
    }

}
