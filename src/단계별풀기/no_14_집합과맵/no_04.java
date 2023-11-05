package 단계별풀기.no_14_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class no_04 {
    //나는야 포켓몬 마스터 이다솜
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<Integer,String> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(int i =1 ;i<=n;i++) {
            String name = br.readLine();
            map1.put(i,name);
            map2.put(name,i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0 ;i<m;i++){
            String input = br.readLine();
            if(49 <= input.charAt(0) && input.charAt(0) <= 57) {
                sb.append(map1.get(Integer.parseInt(input))).append("\n");
            }else{
                sb.append(map2.get(input)).append("\n");
            }
        }
        System.out.print(sb);
    }
}
