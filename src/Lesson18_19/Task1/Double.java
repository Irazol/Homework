package Lesson18_19.Task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

public class Double {
    public static void doubleValues(ArrayList <String> array){
        ListIterator<String> listIterator  = array.listIterator();
        while(listIterator.hasNext() ){
            listIterator.add(listIterator.next());
            }
    }
    public static void main(String[] args) throws Exception {
        ArrayList <String> words = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        String str;
        int i = 0;
        while(i < 5){
            str = input.readLine();
            words.add(str);
            i++;
        }
        System.out.println("Введенні слова - "+words);
        doubleValues(words);
        System.out.println("\nЗадвоення слів- "+words);
        System.out.println("\nВивід слів за допомогою циклу for:");
        for (String word:words) {
            System.out.println(word);
        }
    }
}
