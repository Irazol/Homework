package Lesson17.Iterator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Введіть 10 елементів масиву(цілі числа)");
        Scanner input = new Scanner(System.in);
        int n;
        int i = 0;
        while (i < 10) {
            n = input.nextInt();
            numbers.add(n);
            i++;
        }
        System.out.println("Звичайний вивід списку");
        System.out.println(numbers);

        System.out.println("Вивід списку за допомогою ітератора");
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator .hasNext()) {
            System.out.println(iterator .next());

        }
    }
}
