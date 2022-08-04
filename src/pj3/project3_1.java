package pj3;

import java.util.Scanner;

public class project3_1 {
    static int seqSearch(int[] a, int n, int key){
        int i=0;

        while(true){
            if(i==n)
                return -1;
            if(a[i] == key)
                return i;
            i++;
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x["+i+"] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.printf("검색할 값: ");
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num ,ky);

        if(idx == -1)
            System.out.printf("그 값의 요소가 없습니다.");
        else System.out.printf("그 값은 x[" + idx + "]에 있습니다.");
    }
}
