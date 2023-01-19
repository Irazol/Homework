package Lesson5;
import java.util.Scanner;
public class Method3 {

    static void  power_3( int n) {
        System.out.println((int)Math.pow(n,3));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some number n:");
        int n = input.nextInt();
        power_3(n);
    }
}
