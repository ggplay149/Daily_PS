package 알고리즘다시준비.chap01_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1598 {
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int[] firstPoint = {a%4,(a/4)+1};
        int[] secondPoint = {b%4,(b/4)+1};
        int answer = (Math.abs(firstPoint[0]-secondPoint[0]))+(Math.abs(firstPoint[1]-secondPoint[1]));
        System.out.print(answer);
    }
}
