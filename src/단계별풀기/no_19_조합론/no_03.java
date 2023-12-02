package 단계별풀기.no_19_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_03 {
    //팩토리얼
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(factory(n));
    }
    public static int factory (int n){
        if(n==1) return 1;
        else if(n==0) return 1;
        else return n * factory(n-1);
    }
}
