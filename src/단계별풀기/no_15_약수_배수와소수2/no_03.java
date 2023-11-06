package 단계별풀기.no_15_약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_03 {
    //분수합
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int y = lcm(b,d);
        int x = ( a * (y/b) ) + ( c * (y/d) );

        int giyak = gcd(x,y);

        y = y/giyak;
        x = x/giyak;


        System.out.print(x + " " + y);
    }

    private static int gcd(int a,int b){
        while(b!=0){
            int r=a%b;
            a = b;
            b = r;
        }
        return a;
    }

    private static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
