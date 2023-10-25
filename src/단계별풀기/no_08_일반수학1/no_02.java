package 단계별풀기.no_08_일반수학1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no_02 {
    //진법 변환2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        String x="";

        ArrayList<String> arr = new ArrayList<>();

        while(true){

            if(n%b>=10) x = Character.toString((char)((n%b)+55));
            else x = String.valueOf(n%b);

            if(n==0) break;

            arr.add(x);
            n /=b;
        }
        Collections.reverse(arr);
        for(String i : arr){
            System.out.print(i);
        }
    }
}
