package Lesson11;

public class Main {
    public static void main(String[] args) {
        Daddy big = new Daddy();
        Daddy.Son younger = big.new Son();

        younger.phrase(younger.n);
        younger.number_of_signs(younger.n);
        younger.min_divisor(younger.n);

        younger.phrase(big.n);
        younger.number_of_signs(big.n);
        younger.min_divisor(big.n);

    }
}
