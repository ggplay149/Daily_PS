package 단계별풀기.no_23_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class no_04 {
    //파도반수열
    static List<Long> arr;
    static int  n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < m ; i ++) {
            arr = new ArrayList<>();
            n = Integer.parseInt(br.readLine());
            arr.add((long)1);
            arr.add((long)1);
            arr.add((long)1);
            long result = w(n);
            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
    private static long w(int n){
        if(n==1) return 1 ;
        for(int i = 3 ; i <=n ; i ++){
            arr.add((long)(arr.get(i-2)+(long)(arr.get(i-3))));
        }
        return arr.get(n-1);
    }
}
