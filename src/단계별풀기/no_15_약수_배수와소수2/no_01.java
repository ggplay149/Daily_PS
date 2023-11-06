package 단계별풀기.no_15_약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_01 {
    //최소공배수
    public static void main(String[] main) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[] answer = new int[t];


        for(int i = 0 ; i < t ; i ++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            answer[i] = lcm(a,b);

        }

        for(int i : answer) System.out.println(i);
    }

    private static int gcd(int a, int b){
        while(b!=0){
            int r= a%b;
            a = b;
            b = r;
        }
        return a;
    }

    private static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
