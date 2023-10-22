package 단계별풀기.no_08_일반수학1;

import java.util.Scanner;

public class no_05 {
    //벌집
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int range = 2;
        int count = 1;

        if(n ==1)System.out.print(1);
        else{
            while(range<=n){
                range = range+( 6*count);
                count++;
            }
            System.out.print(count);
        }
    }
}
