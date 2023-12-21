package 단계별풀기.no_23_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_12 {
    //가장 긴 증가하는 부분 수열
    static int n;
    static int[] arr;
    static Integer[] dp;
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        dp = new Integer[n];

        for(int i =  0; i < n ; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;
        for(int i =  1; i < n ; i ++){

            if(arr[i]==arr[i-1]){
                dp[i] = dp[i-1];
            }else{
                int max =0;
                int idx =0;
                for(int j =  0; j < i ; j ++){
                    if(arr[j]<arr[i]) {
                        if(max<dp[j]){
                            max = dp[j];
                            idx =j;
                        }
                    }
                }
                if(max == 0) dp[i] = 1;
                else {
                    dp[i] = dp[idx]+1;
                }
            }
        }

        int max=0;
        for(int i =  0; i < n ; i ++){
            if(max<dp[i]) max = dp[i];
        }
        System.out.print(max);
    }
}
