package Lesson21.Task2;

/**
 * create new class Sum
 *@autor Ira
 */
public final class Sum {

    /**
     * @param num1 type int
     * @param num2 type int
     */
    public void mathSum(int num1, int num2 ){
        int sum = num1+num2;
        System.out.println(sum);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.mathSum(100,200);
    }
}
