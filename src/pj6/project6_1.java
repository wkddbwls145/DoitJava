package pj6;

import java.util.Scanner;

public class project6_1 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //첫번째 방법
//    static void bubbleSort(int[] a, int n){
//        for (int i = 0; i < n-1; i++) {
//            for (int j = n-1; j > i; j--) {
//                if(a[j-1] > a[j])
//                    swap(a,j-1,j);
//            }
//        }
//    }

    //두번째
//    static void bubbleSort(int[] a, int n){
//        for (int i = 0; i < n-1; i++) {
//            int exchange =0;
//            for (int j = n-1; j > i; j--) {
//                if(a[j-1] > a[j]){
//                    swap(a, j-1, j);
//                    exchange++;
//                }
//                if(exchange == 0) break;
//            }
//        }
//    }

    //세번째
    static void bubbleSort(int[] a, int n){
        int k=0;
        while(k<n-1){
            int last = n-1;
            for (int j = n-1; j >k ; j--) {
                if(a[j-1] > a[j]){
                    swap(a,j-1,j);
                    last = j;
                }
                k = last;
            }
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수 : ");

        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x,nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x["+i+"]= "+x[i]);
        }
    }
}
