package 단계별풀기.no_22_백트랙킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_03 {
    // N과 M (3)
    private static StringBuilder sb = new StringBuilder();
    private static int[] arr;
    private static int m;
    private static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        findCase(0);
        System.out.print(sb);
    }
    private static void findCase( int depth){
        if(m == depth){
            for(int a : arr) sb.append(a + " ");
            sb.append("\n");
            return;
        }
        for(int i = 1 ; i <= n ; i ++){
            arr[depth] = i;
            findCase(depth+1);
        }
    }
}
