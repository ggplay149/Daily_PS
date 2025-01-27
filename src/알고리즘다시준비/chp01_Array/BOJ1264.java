package 알고리즘다시준비.chp01_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1264 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {

            String input = br.readLine();

            if(input.equals("#"))break;

            String[] inputArray = input.trim().toLowerCase().split("");
            int count = 0;
            for(String s : inputArray){
                if(s.equals("a")|| s.equals("e") || s.equals("i")|| s.equals("o")|| s.equals("u")) count++;
            }
            System.out.println(count);
        }
    }
}
