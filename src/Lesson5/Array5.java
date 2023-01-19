package Lesson5;

//вывести последовательность фибоначи. до того числа которое введет пользователь(индекс)
import java.util.Scanner;
public class Array5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть якесь число n:");
        int n = input.nextInt();
        int[] array = new int[n];

        System.out.print("Послідовність Фібоначчі по індекс " + n +" включно  = ");
        int i=0;
            while(i<n) {
                if (i == 0) array[i] = 0;
                else if (i == 1) array[i] = 1;
                else if (i > 1) array[i] = array[i - 2] + array[i - 1];
                System.out.print(array[i] + " ");
                i++;
        }
    }
}
