package 단계별풀기.no_13_정렬;

import java.io.*;
import java.util.Arrays;

public class no_04 {
    //수 정렬하기2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int a : arr) bw.write(String.valueOf(arr));
        bw.flush();
        bw.close();
    }
}
