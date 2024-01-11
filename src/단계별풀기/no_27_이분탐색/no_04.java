package 단계별풀기.no_27_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_04 {
    //나무 자르기
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long[] arr = new long[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        long start = 1;
        long end = arr[n-1];
        long max = 0, sum =0;

        while(start<=end){
            long mid = (start+end)/2;
            sum = 0;
            for(int i = 0 ; i < n ; i ++){
                long temp = arr[i] - mid;
                if(temp <0) temp = 0;
                sum += temp;
            }
            if(sum>=m){
                start = mid+1;
                max = mid;
            }
            else if(sum<m){
                end = mid-1;
            }
        }
        if(sum != m) end = max;
        System.out.print(end);
    }
}
