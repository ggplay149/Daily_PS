package 단계별풀기.no_21_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class no_03{
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            sb.append(isPalindrome(br.readLine())).append(" "+count).append("\n");
            count=0;
        }
        System.out.print(sb);
    }
    public static int recursion(String s, int l, int r){
        count ++;
        if(l >= r) {
            return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}