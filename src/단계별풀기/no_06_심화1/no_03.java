package 단계별풀기.no_06_심화1;

import java.util.Scanner;

public class no_03 {
    //별 찍기 - 7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2 * sc.nextInt() - 1;
        int k = 1;
        for (int i = 0; i < a / 2; i++) {
            for (int j = (a / 2) - i; j > 0; j--) System.out.print(" ");
            for (int j = 0; j < k; j++) System.out.print("*");
            k += 2;
            System.out.println("");
        }
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = a / 2; i >0 ; i--) {
            for (int j = 0; j <=a/2-i; j++) System.out.print(" ");
            for (int j = 0; j < k-2; j++) System.out.print("*");
            k -= 2;
            System.out.println("");
        }
    }
}
