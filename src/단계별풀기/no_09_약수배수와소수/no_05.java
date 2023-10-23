package 단계별풀기.no_09_약수배수와소수;

import java.util.Scanner;

public class no_05 {
    //소수
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
        int min = 10000;
        int sum = 0;


        for(int i =a ; i<=b ; i++){

            int count = 0;
            for(int j =1 ; j<=i ; j++){
                if(i%j==0) count++;
            }
            if(count ==2){
                answer++;
                sum += i;
                if(min>i) min = i;
            }
        }
        if(answer == 0) System.out.print(-1);
        else{
            System.out.println(sum);
            System.out.print(min);
        }
    }
}
