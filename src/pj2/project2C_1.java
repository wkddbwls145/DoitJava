package pj2;

import java.util.Arrays;

public class project2C_1 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.printf("a = " + Arrays.toString(a));
        System.out.printf("b = " + Arrays.toString(b));


    }
}
