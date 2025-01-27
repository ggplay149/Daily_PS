package 알고리즘다시준비.chap01_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2738 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int boardA[][] = new int[n][m];
        int boardB[][] = new int[n][m];
        int answer[][] = new int[n][m];

        for(int i  = 0 ; i < n ; i ++ ) {
            input = br.readLine().split(" ");
            for(int j = 0 ; j < m ; j ++){
                boardA[i][j] = Integer.parseInt(input[j]);
            }
        }

        for(int i  = 0 ; i < n ; i ++ ) {
            input = br.readLine().split(" ");
            for(int j = 0 ; j < m ; j ++){
                boardB[i][j] = Integer.parseInt(input[j]);
            }
        }

        for(int i  = 0 ; i < n ; i ++ ) {
            for(int j = 0 ; j < m ; j ++){
                answer[i][j] = boardA[i][j]+boardB[i][j];
            }
        }

        br.close();

        for(int i  = 0 ; i < n ; i ++ ) {
            for(int j = 0 ; j < m ; j ++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }

    }
}
