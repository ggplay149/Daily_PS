package 단계별풀기.no_05_문자열;

import java.util.Scanner;

public class no_03 {
    //문자열
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] t = new String[a];
        for(int i = 0 ; i < a ; i++){
            String b = sc.next();
            t[i]= b;
        }
        for(int i = 0 ; i < a ; i++){
            System.out.print(t[i].charAt(0));
            System.out.println(t[i].charAt(t[i].length()-1));
        };
    }
}
