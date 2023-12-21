package 단계별풀기.no_23_동적계획법1;

import java.util.Scanner;

public class no_10 {
    //쉬운계단 수
    static int n;
    static long[][] dp;
    static long mod = 1000000000;

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new long[n+1][10];
        for(int i = 0; i <= 9 ; i ++){
            dp[1][i] = 1L;
        }
        for(int i = 2; i <=n ; i ++){
            dp[i][0] = dp[i-1][1]%mod;
            for(int j=1; j<=8; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%mod;
            }
            dp[i][9] = dp[i-1][8]%mod;
        }
        long result = 0;
        for(int i = 1; i <=9 ; i ++) result = (result+dp[n][i])%mod;
        System.out.print(result);
    }
}
