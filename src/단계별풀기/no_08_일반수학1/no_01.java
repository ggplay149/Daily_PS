package 단계별풀기.no_08_일반수학1;

import java.util.Scanner;

public class no_01 {
    //진법 변환
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[1]);
        int sum = 0;
        int idx = 0;
        int a = 0;

        for(int i = input[0].length()-1 ;i>=0 ;i--){
            if(input[0].charAt(idx)-55>=10) a= input[0].charAt(idx)-55;
            else a = (int) input[0].charAt(idx)-48;
            idx++;
            sum += a*(Math.pow(n,i));
        }
        System.out.print(sum);
    }
}
