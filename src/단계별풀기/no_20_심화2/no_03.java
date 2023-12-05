package 단계별풀기.no_20_심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class no_03 {
    //붙임성 좋은 총총이
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int flag = 0;
        HashSet<String> set = new HashSet<>();

        for(int i = 0 ; i < n ; i ++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if(a.equals("ChongChong") || b.equals("ChongChong")){
                flag = 1;
                set.add(a);
                set.add(b);
            }

            if(flag==1 && (set.contains(a)||set.contains(b))){
                set.add(a);
                set.add(b);
            }
        }
        System.out.print(set.size());
    }
}
