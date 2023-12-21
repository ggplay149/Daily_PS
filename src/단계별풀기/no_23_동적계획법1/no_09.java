package 단계별풀기.no_23_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_09 {
    //1로 만들기
    static Integer[] dp;

    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n+3];
        dp[1]=0;
        dp[2]=1;
        dp[3]=1;

        System.out.print(cal(n));

    }
    static int cal(int n){

        if(dp[n]!=null) return dp[n];

        if(n%2!=0 && n%3!=0) {
            dp[n] = cal(n-1)+1;
        }else {

            int temp1 =1000;
            int temp2 =1000;

            if (n % 2 == 0) {
                temp1 = Math.min(cal(n / 2) + 1, cal(n - 1) + 1);
            }
            if (n % 3 == 0) {
                temp2 = Math.min(cal(n / 3) + 1, cal(n - 1) + 1);
            }
            dp[n] = Math.min(temp1,temp2);
        }
        return dp[n];
    }
}
