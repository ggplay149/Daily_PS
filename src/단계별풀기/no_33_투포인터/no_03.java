package 단계별풀기.no_33_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_03 {
    public static void main(String[] args)throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        long[] arr = new long[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i ++ ){
            arr[i] = Long.parseLong(st.nextToken());
        }
        int start = 0 , end = 0;
        long min = Long.MAX_VALUE;
        long sum = 0;

        while(start<=n && end <=n){
            if(sum>= target && min > end-start) min = end-start;

            if(sum<target) sum += arr[end++];
            else sum -= arr[start++];

        }
        if(min == Long.MAX_VALUE)System.out.print(0);
        else System.out.print(min);
    }
}
