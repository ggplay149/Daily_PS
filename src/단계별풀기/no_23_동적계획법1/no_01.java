package 단계별풀기.no_23_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_01 {
    //알고리즘 수업 - 피보나치 수 1
    static int n, count1=0, count2=0;
    static int[] memo;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        memo = new int[n+1];
        fib(n);
        fibonacci(n);
        System.out.print(count1+ " "+count2);

    }
    static int fib (int n){
        if( n == 1 || n ==2){
            count1++;
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    static int fibonacci(int n){

        if(n == 1 || n == 2){
            return memo[n]=1;
        }
        if(memo[n]!=0){
            return memo[n];
        }

        count2++;
        return memo[n] = fibonacci(n-1)+fibonacci(n-2);
    }
}
