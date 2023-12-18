package 단계별풀기.no_23_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_07 {
    static int[][] dp;
    static int[][] input;
    static int max=-10000000;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        input = new int[n][n];
        dp = new int[n][n];
        for(int i = 0 ; i <n ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < i+1 ; j ++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if(n==1) System.out.print(input[0][0]);
        else {

            dp[0][0] = input[0][0];

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    int plus = 0;
                    if (j == 0) {
                        plus = dp[i - 1][j] + input[i][j];
                        dp[i][j] = plus;
                    } else if (j == i) {
                        plus = dp[i - 1][j - 1] + input[i][j];
                        dp[i][j] = plus;
                    } else {
                        plus = Math.max(dp[i - 1][j] + input[i][j], dp[i - 1][j - 1] + input[i][j]);
                        dp[i][j] = plus;
                    }
                    if (max < plus) max = plus;
                }

            }
            System.out.println(max);
        }
    }
}
