package 단계별풀기.no_14_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class no_01 {
    //숫자카드
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i<n ; i++) map.put(st.nextToken(),1);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<m ; i++){
            if(map.containsKey(st.nextToken())){
                sb.append("1").append(" ");
            }else{
                sb.append("0").append(" ");
            }
        }
        System.out.print(sb);
    }
}
