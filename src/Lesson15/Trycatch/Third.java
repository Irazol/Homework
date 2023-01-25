package Lesson15.Trycatch;

public class Third {

    public static void main(String[] args) {
        try {
            int [] numb = new int[-2];
        }
        catch (NegativeArraySizeException  e){
            System.out.println("Помилка - задано неправильно розмір массиву, кількість елементів в массиві не може бути від'ємною ");
        }
    }
}
