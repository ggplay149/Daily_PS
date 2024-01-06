package 단계별풀기.no_27_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_03 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];

        for(int i = 0; i < n ; i ++ ){
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);
        long start = 1;
        long end = arr[n-1];
        long mid = 0;
        long max = 0,sum=0;

        while(start<=end){

            mid = (start+end)/2;
            sum = 0;

            for(long i : arr){
                sum += (i/mid);
            }
            if(sum >= m) {
                max = mid;
                start = mid+1;
            }
            else end = mid-1;
        }
        if(sum < m) mid = max;
        System.out.print(mid);
    }
}
