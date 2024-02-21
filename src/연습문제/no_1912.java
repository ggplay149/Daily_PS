package 연습문제;
import java.io.*;
import java.util.*;
public class no_1912 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[n];
        int[] dp = new int[n];

        for(int i = 0 ; i < n ; i ++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i ++){
            if(i==0) dp[i] = list[0];
            else dp[i] = Math.max(dp[i-1]+list[i],list[i]);
            if(dp[i]>max) max = dp[i];
        }
        System.out.print(max);
    }
}
