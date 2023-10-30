package 단계별풀기.no_13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_05 {
    //수 정렬하기3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        for(int i = 0 ; i< n ; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 1 ; i< 10001 ; i++){
            while(arr[i]>0){
                sb.append(i).append("\n");
                arr[i]--;
            }
        }
        System.out.print(sb);
    }

}
