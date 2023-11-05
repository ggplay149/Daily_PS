package 단계별풀기.no_14_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class no_08 {
    //서로 다른 부분 문자열의 개수
    static HashSet<String> set = new HashSet<>();
    static String input;
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        for(int i = 0 ; i < input.length() ; i ++ ){
            fact(i,input.length());
        }
        System.out.print(set.size());
    }
    private static int fact(int i, int n){
        if(n!=0 && n>i){
            set.add(input.substring(i,n));
            return fact(i,n-1);
        }else{
            return 0;
        }
    }
}
