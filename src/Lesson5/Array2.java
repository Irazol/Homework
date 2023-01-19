package Lesson5;

//Сложить два массива, каждый элемент одного массива с каждым элементом другого массива
//Создала одной длины массивы так как разной длины нельзя сложить массивы

public class Array2 {
    public static void main(String[] args) {

        String[] numbs1 = {"o", "t", "th", "fo", "fi", "s"};
        String[] numbs2 = {"ne", "wo", "ree", "ur", "ve", "ix"};
        String[] numbs = new String[numbs2.length];
        for(int i = 0; i < numbs2.length; i++){
            numbs[i]=numbs1[i]+numbs2[i];
            System.out.print(numbs[i]+" ");
        }
    }
}