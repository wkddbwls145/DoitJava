package pj5;

import java.util.Scanner;

public class project5_6 {
    static String[] memo;

    //메모화를 도입한 recur 메서드
    static void recur(int n){
        if(memo[n+1] != null)
            System.out.println(memo[n+1]);
        else {
            if(n>0){
                recur(n-1);
                System.out.println(n);
                recur(n-2);
                memo[n+1] = memo[n] + n+"\n"+memo[n-1];
            }else{
                memo[n+1] = "";
            }
        }
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요.: ");
        int x = stdIn.nextInt();

        memo = new String[x+2];
        recur(x);
    }
}
