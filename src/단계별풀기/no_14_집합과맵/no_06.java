package 단계별풀기.no_14_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class no_06 {
    //듣보잡
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i ++ ) {
            map.put(br.readLine(),0);
        }
        ArrayList arr = new ArrayList<>();
        for(int i = 0 ; i < m ; i ++ ) {
            String input = br.readLine();
            if(map.containsKey(input)) arr.add(input);
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        Collections.sort(arr);
        for(Object i : arr){
            count ++;
            sb.append(i.toString()).append("\n");

        }
        System.out.println(count);
        System.out.println(sb);
    }
}
