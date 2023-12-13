package 단계별풀기.no_21_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class no_02 {
    //피보나치 수5
    static int n , count=0;
    static List<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr.add(0);
        arr.add(1);
        if(n ==0){
            System.out.print(0);
        }else {
            factorial(1);
            System.out.print(arr.get(arr.size() - 1));
        }
    }
    public static long factorial(int m){
        if( n == count+1 ) return 0;
        arr.add(m);
        count++;
        return factorial(arr.get(count) + arr.get(count+1));
    }
}
