package Lesson5;
import java.util.Scanner;
public class Method2 {

    static void  power( int n) {
        System.out.println(((int)Math.pow(n,2)+" "+((int)Math.pow(n,2)+2)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some number n:");
        int n = input.nextInt();
        power(n);
    }
}
