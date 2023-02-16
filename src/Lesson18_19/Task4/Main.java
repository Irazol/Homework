package Lesson18_19.Task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        String str = input.readLine();
        while (!str.equals("end")){
            words.add(str);
            str = input.readLine();
        }
        for (String word:words) {
            System.out.println(word);
        }
    }
}
