package Lesson18_19.Task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void inputData(Map<String,String> map) throws Exception {
        Scanner inp = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        System.out.println("Введіть кількість родин n =  ");
        int n = inp.nextInt();
        int i = 1;

        while(i <= n) {
            System.out.println("Введіть місто проживання "+ i +" родини:");
            String city = input.readLine();
            System.out.println("Введіть прізвище "+ i +" родини:");
            String secondName = input.readLine();
            map.put(city, secondName);
            i ++;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        LinkedHashMap <String,String> linkedHashMap = new LinkedHashMap<>();
        inputData(linkedHashMap);

        HashMap<String,String> hashMap = new HashMap<>(linkedHashMap);

        TreeMap <String,String> treeMap = new TreeMap<>(new Comparator<String>()
        {
            public int compare(String t1, String t2)
            {
                return t2.compareTo(t1);
            }
        });
        treeMap.putAll(linkedHashMap);

        System.out.println("Реалізація за допомогою LinkedHashMap: ");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("\nРеалізація за допомогою HashMap: ");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("\nРеалізація за допомогою TreeMap(зміненно порядок сортування):");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("\nВведіть місто: ");
        String city = input.nextLine();

        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            if(city.equals(entry.getKey())){
                System.out.println(entry.getValue());
            }
        }
    }
}
