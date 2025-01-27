package 알고리즘다시준비.chp01_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ10871 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int num = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
        int arr[] = new int[num];

        String[] inputArr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < num ; i ++){
            if(Integer.parseInt(inputArr[i])<x) sb.append(inputArr[i]+" ");
        }
        System.out.print(sb.toString().trim());
    }
}
