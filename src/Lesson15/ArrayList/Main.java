package Lesson15.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Введіть сім елементів масиву");
        Scanner input = new Scanner(System.in);
        int n;
        int j = 0;
        while (j < 7) {
            n = input.nextInt();
            numbers.add(n);
            j++;
        }
        System.out.println("Введений масив:");
        System.out.println(numbers);

        int a = numbers.get(0) * numbers.get(6);
        numbers.set(0, a);
        Collections.sort(numbers);
        System.out.println("Відсортований масив:");
        System.out.println(numbers);
    }
}