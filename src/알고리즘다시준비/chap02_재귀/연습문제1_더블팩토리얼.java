package 알고리즘다시준비.chap02_재귀;

import java.util.Scanner;

public class 연습문제1_더블팩토리얼 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(doubleFactorial(n));
    }

    private static int doubleFactorial(int n) {
        if(n == 1) return 1;
        else if (n == 2) return 2;
        return n*doubleFactorial(n-2);
    }
}


