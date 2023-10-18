package 단계별풀기.no_05_문자열;

import java.util.Scanner;

public class no_05 {
    //숫자의 합
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int sum = 0;
        for(int i = 0 ; i < a ; i++) sum += Integer.parseInt(String.valueOf(b.charAt(i)));
        System.out.print(sum);
    }
}
