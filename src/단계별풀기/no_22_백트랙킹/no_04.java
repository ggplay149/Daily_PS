package 단계별풀기.no_22_백트랙킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_04 {
    //N과 M (4)
    private static StringBuilder sb = new StringBuilder();
    private static int[] arr;
    private static int m;
    private static int n;
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        findCase(1,0);
        System.out.print(sb);
    }
    private static void findCase( int at, int depth){
        if(m == depth){
            for(int a : arr) sb.append(a + " ");
            sb.append("\n");
            return;
        }
        for(int i = at ; i <= n ; i ++){
            arr[depth] = i;
            findCase(i,depth+1);
            if(i == n) count++;
        }
    }
}
