package 단계별풀기.no_05_문자열;

import java.io.*;

public class no_09 {
    //상수
    public static void main(String[] args)throws IOException{
        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] s = br.readLine().split(" ");
            StringBuffer sb1 = new StringBuffer(s[0]);
            StringBuffer sb2 = new StringBuffer(s[1]);
            int a = Integer.parseInt(sb1.reverse().toString());
            int b = Integer.parseInt(sb2.reverse().toString());
            int max = a == b ?
                    Integer.parseInt(sb1.toString()) : (a > b ? Integer.parseInt(sb1.toString()) : Integer.parseInt(sb2.toString()));
            System.out.print(max);
        }
    }
}
