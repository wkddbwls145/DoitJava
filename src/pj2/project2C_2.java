package pj2;

public class project2C_2 {
    public static void main(String[] args){
        double[] a = {1.0,2.0,3.0,4.0,5.0};

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a["+i+"] = " + a[i]);
        }

        double sum = 0;

        for (double i: a) {
            sum += i;
        }

        System.out.printf("모든 요소의 합은 " + sum + "입니다.");
    }

}
