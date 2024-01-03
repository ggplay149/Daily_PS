package 단계별풀기.no_26_분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_06 {
    //행렬곱셈
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[n][m];
        for(int i = 0; i < n ; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m ; j ++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] arr2 = new int[x][y];
        for(int i = 0; i < x ; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < y ; j ++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] result = new int[n][y];
        for(int i = 0; i < n ; i ++){
            for(int j = 0; j < m ; j ++) {
                for(int k = 0; k < y ; k ++) {
                    result[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n ; i ++){
            for(int j = 0; j < y ; j ++) {
                sb.append(result[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
