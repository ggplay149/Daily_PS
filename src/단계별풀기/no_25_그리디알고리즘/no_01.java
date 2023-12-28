package 단계별풀기.no_25_그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_01 {
    //동전0
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i =0 ; i < n ; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //내림차순
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        int count = 0;
        int idx = 0;
        while(true){
            if(k==0) break;
            if(k<arr[idx]){
                idx++;
            }else{
                int tmp = k/arr[idx];
                count += tmp;
                k = k-(tmp*arr[idx]);
            }
        }
        System.out.print(count);
    }
}
