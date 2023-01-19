package Lesson5;
import java.util.Scanner;
public class Method4 {

    static void  power_n( int n,int m) {

        int power = 1;
        for (int i = 1; i <= m; i++) {
            power*=n;
            }
        System.out.println(n+" to the power of "+ m+ " is "+power);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some number n:");
        int n = input.nextInt();
        System.out.println("Input some number m:");
        int m = input.nextInt();
        power_n(n,m);
    }
}
