package 단계별풀기.no_33_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class no_04 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);

        for(int i = 2 ; i*i <=n ; i++){
            if(isPrime[i]){
                for(int j = i*i ; j <=n ; j+=i){
                    isPrime[j]=false;
                }
            }
        }

        List<Integer> prime = new ArrayList<>();
        for(int i = 2 ; i < isPrime.length ; i ++){
            if(isPrime[i]){
                prime.add(i);
            }
        }
        int length = prime.size();
        prime.add(0);
        int start = 0 ,end = 0, sum = 0, count = 0;
        while(start<=length && end<=length){
            if(sum == n) count++;
            if(sum<n) sum +=prime.get(end++);
            else sum -=prime.get(start++);
        }
        System.out.print(count);
    }
}
