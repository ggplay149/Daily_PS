package 연습문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_11053 {
    //LIS
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        int[] list = new int[n+1];
        int max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n ; i ++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1 ; i <=n ; i ++){
            dp[i]=1;
            for(int j = 1 ; j <=i ; j ++){
                if(list[i]>list[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);

                }
            }
            max = Math.max(dp[i],max);
        }
        System.out.print(max);
    }
}
