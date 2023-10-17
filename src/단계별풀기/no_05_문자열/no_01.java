package 단계별풀기.no_05_문자열;

import java.util.Scanner;

public class no_01 {
    //문자와 문자열
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();

        System.out.print(a.charAt(b-1));

    }
}
