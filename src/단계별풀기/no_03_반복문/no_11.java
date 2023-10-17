package 단계별풀기.no_03_반복문;

import java.util.Scanner;

public class no_11 {
    //A+B-5
    public static void main (String[] ars){

        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) break;
            else System.out.println((a+b));
        }
    }
}
