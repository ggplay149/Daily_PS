package 단계별풀기.no_12_브루트포스;

import java.util.ArrayList;
import java.util.Scanner;

public class no_02 {
    //분해합
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = n;
        for(int i = 1 ; i<= n ;i++){
            String m = String.valueOf(i);
            ArrayList<Integer> arr = new ArrayList<>();

            for(int j = 0 ; j< m.length() ; j++)  arr.add(m.charAt(j)-'0');

            int sum = 0;
            for(int k : arr) sum+=k;

            if(sum+i==n)if(i<min) min = i;
        }
        if(min == n) min = 0;
        System.out.print(min);
    }
}
