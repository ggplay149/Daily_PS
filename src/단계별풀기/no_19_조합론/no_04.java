package 단계별풀기.no_19_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_04 {
    //이항 계수 1
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.print(factory(n)/(factory(n-k)*factory(k)));
    }
    public static int factory (int n){
        if(n==1) return 1;
        else if(n==0) return 1;
        else return n * factory(n-1);
    }
}
