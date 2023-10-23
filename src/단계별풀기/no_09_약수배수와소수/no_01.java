package 단계별풀기.no_09_약수배수와소수;

import java.util.Scanner;

public class no_01 {
    //배수와 약수
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){

            String[] input = sc.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if(a != 0 && b != 0){
                if(b%a==0) System.out.println("factor");
                else if(a%b==0)System.out.println("multiple");
                else System.out.println("neither");
            } else break;
        }
    }
}
