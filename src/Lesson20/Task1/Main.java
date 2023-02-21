package Lesson20.Task1;

import java.io.*;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Іра\\Desktop\\Java\\Homework\\src\\Lesson20\\Task1\\test");
        LinkedList<Integer> numbs = new LinkedList<>();
        for (int i = 0; i < 100;  i+=10) {
            numbs.offer(i);
        }

        FileWriter write = new FileWriter(file);
        PrintWriter print = new PrintWriter(write );

        print.println(numbs);
        print .flush();
        print .close();

        FileReader readfile = new FileReader(file);
        BufferedReader br = new BufferedReader(readfile );
        System.out.println(br.readLine());
    }
}
