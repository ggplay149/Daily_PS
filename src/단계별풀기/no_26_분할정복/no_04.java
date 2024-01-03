package 단계별풀기.no_26_분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_04 {
    //곱셈
    static int d;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());


        System.out.print(pow(n,m)%d);
    }

    public static long pow(int n , int m){
        if(m == 0) return 1;
        long res = pow(n,m/2);
        if(m%2==0) return res*res%d;
        else return (res*res%d)*n%d;
    }
}
