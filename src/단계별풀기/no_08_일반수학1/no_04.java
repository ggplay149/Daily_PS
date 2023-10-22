package 단계별풀기.no_08_일반수학1;

import java.util.Scanner;

public class no_04 {
    //중앙이동 알고리즘
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int xy = 2;
        int sum= 0;
        for(int i = 0 ; i<t ; i++) xy += (int)(Math.pow(2,t-i-1));
        System.out.println(xy*xy);
    }
}
