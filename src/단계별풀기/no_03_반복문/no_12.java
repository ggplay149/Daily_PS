package 단계별풀기.no_03_반복문;

import java.util.Scanner;

public class no_12 {
    //A+B-4
    public static void main (String[] ars){

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) break;
            else System.out.println((a+b));
        }
    }
}
