package 단계별풀기.no_12_브루트포스;

import java.util.Scanner;

public class no_05 {
    //영화감독 숌
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0, i=0;

        while(true){
            if(String.valueOf(i).contains("666")) count++;
            if(count == n){
                System.out.print(i);
                break;
            }
            i++;
        }
    }
}
