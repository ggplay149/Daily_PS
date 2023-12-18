package 단계별풀기.no_23_동적계획법1;

import java.util.Scanner;

public class no_09 {
    static int[] dp;
    static int count=0;
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        dp = new int[input];
        System.out.print(dp_fn(input));
    }

    public static int dp_fn(int n) {
        count++;
        if(n==1) return count;
        else if (n % 3 == 0) {
            dp[n] = dp_fn(n/3);
        } else if (n % 2 == 0) {
            dp[n] = dp_fn(n/2);
        } else {
            dp[n] = dp_fn(n-1);
        }
        return 0;
    }
}
