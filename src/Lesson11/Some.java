package Lesson11;

public class Some {
    int n = 1219;

    public void binary(int n) {
        int m = n / 2;
        if (m > 0) binary(m);
        System.out.print(n % 2);
    }

    public void phrase(int n) {
        System.out.print("Число " + n + " в двійковій системі числення: ");
        binary(n);
    }

    public void number_of_signs(int n) {
        int count = 0;
        int m = n;
        while (m != 0) {
            count++;
            m /= 10;
        }
        System.out.println("");
        System.out.println("Кількість знаків в числі " + n + " : " + count);
    }

    public void min_divisor(int n) {
        int i = 2;
        while (n % i != 0) {
            i++;
        }
        System.out.println("Найменьший дільник числа " + n + " : " + i);
    }
}
