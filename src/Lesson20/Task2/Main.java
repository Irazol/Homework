package Lesson20.Task2;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Іра\\Desktop\\Java\\Homework\\src\\Lesson20\\Task2","test");


        PrintWriter print = new PrintWriter(file );

        print.println("  Prints formatted representations of objects to a text-output stream." +
                "\n This class implements all of the print methods found in PrintStream. " +
                "\n It does not contain methods for writing raw bytes, for which a program" +
                "\n should use unencoded byte streams.");
        print .flush();
        print .close();



        FileReader readfile = new FileReader(file);
        BufferedReader br = new BufferedReader(readfile );
        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
