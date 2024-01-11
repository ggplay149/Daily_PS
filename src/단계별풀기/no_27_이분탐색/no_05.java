package 단계별풀기.no_27_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_05 {
    //공유기 설치
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);

        long start = 1;
        long end = arr[n-1];

        while(start<=end){
            long mid = (start+end)/2;
            int count = 1;
            int position = 0;
            for(int i = 1 ; i < n ; i ++){
                if(arr[i]-arr[position]>=mid){
                    position = i;
                    count ++;
                }
            }
            if(count>=m) start = mid+1;
            else end = mid-1;
        }
        System.out.println(end);
    }
}
