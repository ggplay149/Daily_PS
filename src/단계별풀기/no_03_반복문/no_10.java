package 단계별풀기.no_03_반복문;

import java.util.Scanner;

public class no_10 {
    //별 찍기-2
    public static void main (String[] ars){

        Scanner sc = new Scanner(System.in);
        int a = 5;
        for( int i = 0 ; i<a ; i++){
            for(int j = 0; j<a-i-1; j++){
                System.out.print(" ");
            }
            for( int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }System.out.println("");
        }

    }
}
