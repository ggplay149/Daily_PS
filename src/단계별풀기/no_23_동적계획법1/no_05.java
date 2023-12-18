package 단계별풀기.no_23_동적계획법1;

import java.io.*;
import java.util.*;

public class no_05{

    static Map<String,Integer> memo = new HashMap<>();
    static int  n;
    static int max=-10000000;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < n ; i++ ){
            String input =st.nextToken();
            memo.put("/"+input,Integer.parseInt(input));
            if(Integer.parseInt(input)>max) max= Integer.parseInt(input);
        }


        System.out.print(max);
    }

}
