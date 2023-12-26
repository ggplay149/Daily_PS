package 단계별풀기.no_24_누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_01 {
    //구간합 구하기4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        arr[0] = 0;

        for(int i = 1 ; i <= n ; i ++){
            int input = Integer.parseInt(st.nextToken());
            arr[i]= input + arr[i-1];
        }

        for(int i = 0 ; i < m ; i ++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(arr[end] - arr[start-1]);
        }
    }
}
