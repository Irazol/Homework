/*Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5 змінних,
 створіть метод для пошуку мінімального, максимального та середнього значень серед цих трьох методів.*/

package Lesson6;
import java.util.Scanner;

public class Methods {
    static double mid(int num11, int num12, int num13){
        double res = (double)(num11+num12+num13)/3;
        System.out.println("Середнє арифметичне 3-х чисел : "+ res);
        return res;
        }
    static double mid(int num21, int num22, int num23, int num24){
        double res = (double)(num21+num22+num23+num24)/4;
        System.out.println("Середнє арифметичне  4-х чисел: "+ res);
        return res;
    }
    static double mid(int num31, int num32, int num33, int num34,int num35){
        double res = (double)(num31+num32+num33+num34+num35)/5;
        System.out.println("Середнє арифметичне 5-ти чисел: "+ res);
        return res;
    }
    static void sort(double a,double b,double c  ){
        double x;
        if (a>b){x=a;a=b;b=x;}
        if (b>c){x=b;b=c;c=x;}
        if (a>b){x=a;a=b;b=x;}
        System.out.println("Мінімальне середнє значення: "+a);
        System.out.println("Середнє значення: "+b);
        System.out.println("Максимальне середнє значення: "+c);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть три числа:");
        int num11 = input.nextInt();
        int num12 = input.nextInt();
        int num13 = input.nextInt();

        System.out.println("Введіть чотири числа:");
        int num21 = input.nextInt();
        int num22 = input.nextInt();
        int num23 = input.nextInt();
        int num24 = input.nextInt();

        System.out.println("Введіть п'ять чисел:");
        int num31 = input.nextInt();
        int num32 = input.nextInt();
        int num33 = input.nextInt();
        int num34 = input.nextInt();
        int num35 = input.nextInt();

        sort (mid(num11,num12,num13),mid(num21,num22,num23,num24),mid(num31,num32,num33,num34,num35));
    }
}
