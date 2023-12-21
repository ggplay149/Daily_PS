package 단계별풀기.no_23_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class no_02 {
    //신나는 함수 실행
    static Map<String,Integer> memo = new HashMap<>();
    static int value = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] input = new int[3];
        int n = 0;

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[0] = Integer.parseInt(st.nextToken());
            input[1] = Integer.parseInt(st.nextToken());
            input[2] = Integer.parseInt(st.nextToken());

            if (input[0] == -1 && input[1] == -1 && input[2] == -1) {
                break;
            }
            int result = w(input[0], input[1], input[2]);
            sb.append("w("+input[0]+", "+input[1]+", "+input[2]+") = " +result+"\n");
        }

        System.out.print(sb);

    }

    private static int w(int a, int b, int c) {
        String key = a+"/"+b+"/"+c;
        if(a<=0 || b<= 0 || c<=0){
            return 1;
        }
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        if(a>20 || b>20 || c>20){
            value = w(20,20,20);
            memo.put(key,value);
            return value;
        }
        if(a<b && b<c){
            value = w(a,b,c-1)+w(a,b-1,c-1)-w(a,b-1,c);
            memo.put(key,value);
            return value;
        }
        value = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        memo.put(key,value);
        return value;
    }
}
