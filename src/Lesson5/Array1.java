package Lesson5;

//Создать массив одномерный, заполненный со всеми типами данных.

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = {1,22,3,44,5,66,7,88,9};
        String[] numbs = {"one", "two", "three", "four","five","six"};
        char[] symbol = {'a','b','c','d','e'};
        boolean[] bool = {true,false};
        double[] point_numb ={1.2, 1.3, 1.4, 1.5, 1.6, 11.77};

        System.out.print("numbers = ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("");

        System.out.print("numbs = ");
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i] + ", ");
        }
        System.out.println("");

        System.out.print("symbol = ");
        for (int i = 0; i < symbol.length; i++) {
            System.out.print(symbol[i] + ", ");
        }
        System.out.println("");

        System.out.print("bool = ");
        for (int i = 0; i < bool.length; i++) {
            System.out.print(bool[i] + ", ");
        }
        System.out.println("");

        System.out.print("point_numb = ");
        for (int i = 0; i < point_numb.length; i++) {
            System.out.print(point_numb[i] + ", ");
        }

    }
}
