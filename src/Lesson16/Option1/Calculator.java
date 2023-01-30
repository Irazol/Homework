package Lesson16.Option1;

public class Calculator<Sometipe> {



    public Sometipe addition(Sometipe a, Sometipe b) {

        if (a.getClass().equals(Integer.class) && b.getClass().equals(Integer.class)  ) {
            System.out.print(a+" + "+b + " = ");
            return (Sometipe) (Object) ((Integer) a + (Integer) b);
        }
        if (a.getClass().equals(Double.class) || b.getClass().equals(Double.class) ) {
            System.out.print(a+" + "+b + " = ");
            return (Sometipe) (Object) ((Double) a + (Double) b);
        }
        System.out.println("");
        return (Sometipe) (Object) 0;
    }

    public Sometipe subtraction(Sometipe a, Sometipe b) {

        if (a.getClass().equals(Integer.class) && b.getClass().equals(Integer.class)  ) {
            System.out.print(a+" - "+b + " = ");
            return (Sometipe) (Object) ((Integer) a - (Integer) b);
        }
        if (a.getClass().equals(Double.class) || b.getClass().equals(Double.class) ) {
            System.out.print(a+" - "+b + " = ");
            return (Sometipe) (Object) ((Double) a - (Double) b);
        }
        System.out.println("");
        return (Sometipe) (Object) 0;
    }

    public Sometipe multiplication(Sometipe a, Sometipe b) {

        if (a.getClass().equals(Integer.class) && b.getClass().equals(Integer.class)  ) {
            System.out.print(a+" * "+b + " = ");
            return (Sometipe) (Object) ((Integer) a * (Integer) b);
        }
        if (a.getClass().equals(Double.class) || b.getClass().equals(Double.class) ) {
            System.out.print(a+" * "+b + " = ");
            return (Sometipe) (Object) ((Double) a * (Double) b);
        }
        System.out.println("");
        return (Sometipe) (Object) 0;
    }

    public Sometipe division (Sometipe a, Sometipe b) {

        if (a.getClass().equals(Integer.class) && b.getClass().equals(Integer.class)  ) {
            System.out.print(a+" / "+b + " = ");
            return (Sometipe) (Object) ((Integer) a / (Integer) b);
        }
        if (a.getClass().equals(Double.class) || b.getClass().equals(Double.class) ) {
            System.out.print(a+" / "+b + " = ");
            return (Sometipe) (Object) ((Double) a / (Double) b);
        }
        System.out.println("");
        return (Sometipe) (Object) 0;
    }

    public Sometipe exponentiation (Sometipe a, Sometipe b) {

        if (a.getClass().equals(Integer.class) && b.getClass().equals(Integer.class)  ) {
            System.out.print(a+" ^ "+b + " = ");
            return (Sometipe) (Object) Math.pow((Integer) a, (Integer) b);
        }
        if (a.getClass().equals(Double.class) || b.getClass().equals(Double.class) ) {
            System.out.print(a+" ^ "+b + " = ");
            return (Sometipe) (Object) Math.pow((Double) a, (Double) b);
        }
        System.out.println("");
        return (Sometipe) (Object) 0;
    }
}


