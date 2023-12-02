package 단계별풀기.no_19_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_05 {
    //다리놓기
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[][] dp =  new int[31][31];

        for(int i=0; i<31; i++)
            for(int j=0; j<31; j++){
                if(i<j) continue;
                else if(i==j || j==0) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }

        for(int i = 0 ; i<t ; i ++ ) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            sb.append(dp[n][k]+"\n");
        }
        System.out.print(sb);
    }

}
