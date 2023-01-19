package Lesson5;

public class Array3 {
    public static void main(String[] args) {
        int[] array1 = new int[12];
        for(int i = array1.length-1; i >= 0; i--){
            array1[i]=i*10+10;
            System.out.print(array1[i] +" ");
        }
        System.out.println("");

        int[] array2 = new int[12];
        for(int i = 0; i <array2.length; i++){
            array2[i]=i*25;
            System.out.print(array2[i] +" ");
        }
        System.out.println("");

        int[] array3 = new int[12];
        for(int i = 0; i <array3.length; i++){
            array3[i] = 1*(int) Math.pow(2,i);
            System.out.print(array3[i] +" ");
        }
    }
}
