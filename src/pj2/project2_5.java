package pj2;

import java.util.Arrays;
import java.util.Scanner;

public class project2_5 {
    static void swap(int[] a, int idx1, int idx2){
        int t=a[idx1]; // t= 1
        a[idx1] = a[idx2]; // a[0] = a[4]
        a[idx2] = t; // a[4] = 1
    }
    
    static void reverse(int[] a){
        for (int i = 0; i < a.length/2; i++) {
            swap(a,i,a.length-i-1);
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println("x = " + Arrays.toString(x));
    }
}