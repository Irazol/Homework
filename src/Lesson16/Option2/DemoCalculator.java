package Lesson16.Option2;



import java.util.Scanner;

public class DemoCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a mathematical operation:" +
                "\n + addition;" +
                "\n - subtraction; "+
                "\n * multiplication; "+
                "\n / division; "+
                "\n ^ exponentiation; ");
        String sign = input.nextLine();
        System.out.println("Input some two number");
        try {
            double a = input.nextDouble();
            double b = input.nextDouble();

            if (a == (int) a && b == (int) b) {
                Calculator<Integer> calculator = new Calculator<>();
                switch ( sign ){
                    case("+"):
                        System.out.println(calculator.addition((int) a, (int) b));
                        break;
                    case("-"):
                        System.out.println(calculator.subtraction((int) a, (int) b));
                        break;
                    case("*"):
                        System.out.println(calculator.multiplication((int) a, (int) b));
                        break;
                    case("/"):
                        System.out.println(calculator.division((int) a, (int) b));
                        break;
                    case("^"):
                        System.out.println(calculator.exponentiation((int) a, (int) b));
                        break;
                    default:
                        System.out.println("Wrong mathematical sign ");
                        break;
                }
            } else {
                Calculator<Double> calculator2 = new Calculator<>();
                switch ( sign ){
                    case("+"):
                        System.out.println(calculator2.addition( a, b));
                        break;
                    case("-"):
                        System.out.println(calculator2.subtraction( a, b));
                        break;
                    case("*"):
                        System.out.println(calculator2.multiplication( a, b));
                        break;
                    case("/"):
                        System.out.println(calculator2.division(a, b));
                        break;
                    case("^"):
                        System.out.println(calculator2.exponentiation( a, b));
                        break;
                    default:
                        System.out.println("Wrong mathematical sign ");
                        break;
                }
            }
        }
        catch (Exception e){
            System.out.println("Input error.Input some two number. Enter a fractional number in the format 1,2(,)");
        }
    }
}

