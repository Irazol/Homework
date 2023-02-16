package Lesson18_19.Task2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ListNumbers {

    public static void getIntegerList(LinkedList<Integer> linkedList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть кількість елементів масиву");
        int n = input.nextInt();
        int i = 0;
        while (i < n) {
            linkedList.offer(input.nextInt());
            i++;
        }
    }
        public static void getMinimum (LinkedList<Integer> linkedList) {

            System.out.println("Мінімальне число "+ Collections.min(linkedList));

            }

    public static void main(String[] args)  {
        LinkedList<Integer> linkedList = new LinkedList<>();
        getIntegerList(linkedList);
        System.out.println("Введенні числа"+linkedList);
        getMinimum(linkedList);
    }
}
