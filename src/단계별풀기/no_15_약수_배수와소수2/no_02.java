package 단계별풀기.no_15_약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_02 {
    //최소공배수
    public static void main(String[] main) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] answer = {Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken())};
        System.out.print(lcm(answer[0],answer[1]));
    }

    private static long gcd(long a, long b){
        while(b!=0){
            long r= a%b;
            a = b;
            b = r;
        }
        return a;
    }

    private static long lcm(long a, long b){
        return a*b/gcd(a,b);
    }

}
