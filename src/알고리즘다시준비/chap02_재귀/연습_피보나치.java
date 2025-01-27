package 알고리즘다시준비.chap02_재귀;

import java.util.Scanner;

public class 연습_피보나치 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibonacci(n));
    }

    private static int fibonacci(int n) {

        if(n==1) return 0;
        else if(n==2) return 1;
        return fibonacci(n-2)+fibonacci(n-1);

    }
}
