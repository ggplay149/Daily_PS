package 단계별풀기.no_09_약수배수와소수;

import java.util.Scanner;

public class no_04 {
    //소수 찾기
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int answer = 0;
        for(int i =0 ;i<c ; i++){

            int input = sc.nextInt();
            int count = 0;


            for(int j =1 ; j<=input ; j++){
                if(input%j==0) count++;
            }
            if(count ==2) answer++;
        }
        System.out.print(answer);
    }

}
