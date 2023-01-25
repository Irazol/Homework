package Lesson15.Trycatch;

public class Second {
    public static void main(String[] args) {
       int [] numbers = new int[2];

       try{
           numbers[0] = 12;
           numbers[1] = 22;
           numbers[2] = 23;
           numbers[5] = 156;
           }
       catch (ArrayIndexOutOfBoundsException  e){
           System.out.println("Помилка - задано елемент масива, який не належить допустимому діапазону");
       }
    }
}
