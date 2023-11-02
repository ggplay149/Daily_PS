package 단계별풀기.no_13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_08 {
    //좌표 정렬하기 2
    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Arrays.sort(arr,(e1, e2) ->{
            if(e1[0] == e2[0]) return e1[1]-e2[1];
            else return e1[0]-e2[0];
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            sb.append(arr[i][1]).append(" ").append(arr[i][0]).append("\n");
        }
        System.out.print(sb);
    }
}
