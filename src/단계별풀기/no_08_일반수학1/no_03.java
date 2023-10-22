package 단계별풀기.no_08_일반수학1;

import java.util.Scanner;

public class no_03 {
    //세탁소 사장 동혁
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            int input = sc.nextInt();
            int a = input/25;
            int b = (input%25)/10;
            int c = ((input%25)%10)/5;
            int d = (((input%25)%10)%5)/1;
            System.out.println(a+" "+b+" "+c+" "+d);
        }
    }
}
