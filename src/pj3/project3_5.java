package pj3;

import java.util.Arrays;
import java.util.Scanner;

public class project3_5 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.printf("x[0]: ");
        x[0] = stdIn.nextInt();

        for (int i = 0; i < num; i++) {
            do{
                System.out.printf("x["+i+"] : ");
                x[i] = stdIn.nextInt();
            }while(x[i] < x[i-1]);
        }
        System.out.printf("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if(idx == -1)
            System.out.printf("그 값의 요소가 없습니다.");
        else System.out.printf("그 값은 x["+idx+"]에 있습니다.");
    }
}
