package study;
import java.util.*;
import java.io.*;

public class temp{
    static int[][] board;
    static int count=0;
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        board = new int[(int)Math.pow(2,n)][(int)Math.pow(2,n)];

        func(0,(int)Math.pow(2,n));

        for(int i = 0; i < 8 ; i ++){
            for(int j = 0; j < 8 ; j ++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void func(int start, int end){
        if(end/2 == 0){
            System.out.println(">>>"+end);
            board[start/2][end/2] = count++;
            board[start/2][end] = count++;
            board[start][end/2] = count++;
            board[start][end] = count++;
            return;
        }
        func(start,end/2);

    }
}




