package 단계별풀기.no_10_기하_직사각형과삼각형;

import java.util.Scanner;

public class no_06 {
    //삼각형 외우기
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String answer = "";

        if(a==b && b==c) answer = "Equilateral";
        else if((a+b+c)==180){
            if(
                    (a==b) && (a!=c)||
                            (a==c) && (a!=b)||
                            (b==c) && (b!=a)
            ) answer = "Isosceles";
            if(a!=b && b!=c && a!=c) answer="Scalene";

        }
        else if ((a+b+c)!=180) answer="Error";

        System.out.print(answer);
    }
}
