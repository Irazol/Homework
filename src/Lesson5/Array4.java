package Lesson5;

//вывести последовательность фибоначи. до того числа которое введет пользователь
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {

        int[] array = new int[1000];
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть якесь число n:");
        int n = input.nextInt();

        for(int i = 0; i <array.length; i++){
            if(i==0)array[i] =0;
            else if(i==1)array[i] =1;
            else if(i>1) array[i] = array[i-2]+array[i-1];
        }

        System.out.print("Послідовність Фібоначчі до числа " + n +" = ");
        int i = 0;
        while(array[i]<=n){
            System.out.print(array[i] + " ");
            i++;
        }
    }
}
