package 알고리즘다시준비.chap02_재귀;

import java.util.Scanner;

public class 연습_2진수로변환 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer ="";
        System.out.print(decimalToBinary(n));
    }

    private static String decimalToBinary(int n) {
        if (n == 0) {
            return "";
        }
        return decimalToBinary(n / 2) + (n % 2);
    }
}
