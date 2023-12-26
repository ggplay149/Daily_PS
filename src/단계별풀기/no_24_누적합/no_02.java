package 단계별풀기.no_24_누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_02 {
    //수열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = -100000000;

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        arr[0] = 0;

        for(int i = 1 ; i <=n ; i ++){
            int input = Integer.parseInt(st.nextToken());
            if(m==1){
                arr[i] = input;
                if (arr[i] > max) max = arr[i];
            }else {
                arr[i] = input + arr[i - 1];
                if (arr[i] > max) max = arr[i];
            }
        }


        if(m == 1) {
            System.out.print(max);
            return;
        }

        if(n-m == 0) {
            System.out.print(arr[n]);
            return;
        }

        max = -100000000;
        for(int i = 0 ; i <=(n-m);  i ++){
            int input = arr[i+m]-arr[i];
            if(max<input) max =input;
        }
        System.out.print(max);
    }
}
