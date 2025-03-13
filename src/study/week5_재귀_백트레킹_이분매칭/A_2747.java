package study.week5_재귀_백트레킹_이분매칭;

import java.util.*;
import java.io.*;

public class A_2747 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.print(0);
        }else {
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            System.out.print(dp[n]);
        }
    }
}


