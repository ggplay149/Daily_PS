package 단계별풀기.no_27_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class no_02 {
    //숫자 카드2
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            int input = Integer.parseInt(st.nextToken());
            map.put(input,map.getOrDefault(input,0)+1);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<m ; i++){
            int key = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(key,0)).append(" ");
        }
        System.out.print(sb);
    }
}
