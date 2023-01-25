package Lesson15.Calculator;

public class Calculate implements Calculator{
    public double a;
    public double b;

    public Calculate(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void addition() {
        System.out.println("Addition: "+a+ " + "+ b+" = "+(a+b));
    }

    @Override
    public void  subtraction() {
        System.out.println("Subtraction: "+a+ " - "+ b+" = "+(a-b));
    }

    @Override
    public void  multiplication() {
        System.out.println("Multiplication: " + a+ " * "+ b+" = "+(a*b));
    }

    @Override
    public void  division() {
        System.out.println("Division: " + a+ " / "+ b+" = "+(a/b));
    }

    @Override
    public void  sqrt() {
        System.out.println("Square root of a number "+a+": "+ Math.sqrt(a));
        System.out.println("Square root of a number "+b+": "+ Math.sqrt(b));
    }

    @Override
    public void  exponentiates() {
        System.out.println("Exponentiates: "+a+ " ^ "+ b+" = "+Math.pow(a,b));
    }
}
