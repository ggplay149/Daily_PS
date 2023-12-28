package 단계별풀기.no_25_그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_03 {
    //ATM
    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int [n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i ++ ){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int sum = 0;
        int total =0;
        for(int i = 0 ; i < n ; i ++ ){
            sum = sum+arr[i];
            total += sum;
        }
        System.out.print(total);
    }
}
