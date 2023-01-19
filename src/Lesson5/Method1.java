package Lesson5;
import java.util.Scanner;
public class Method1 {
    static boolean multiple_of_two( int n) {
        if(n%2!=0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some number n:");
        int n = input.nextInt();
        System.out.println(multiple_of_two(n));
    }
}
