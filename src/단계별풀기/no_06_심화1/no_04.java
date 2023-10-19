package 단계별풀기.no_06_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_04 {
    //팰린드롬인지 확인하기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringBuffer b = new StringBuffer(a).reverse();
        if(a.equals(b.toString()))System.out.print(1);
        else System.out.print(0);
    }
}
