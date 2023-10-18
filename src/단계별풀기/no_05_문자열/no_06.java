package 단계별풀기.no_05_문자열;

import java.util.Scanner;
//알파벳 찾기
public class no_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "abcdefghijklmnopqrstuvwxyz";
        int[] c = new int[26];

        for(int i = 0 ; i < 26 ; i++) c[i]=-1;

        for(int i = 0 ; i < 26 ; i++){
            for(int j = 0 ; j< a.length() ; j++){
                if(b.charAt(i)== a.charAt(j))
                    if(c[i]== -1) c[i] = j;
            }
        }
        for(int i = 0 ; i < 26 ; i++) System.out.print(c[i]+" ");

    }

}
