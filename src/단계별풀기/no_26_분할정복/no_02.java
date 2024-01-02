package 단계별풀기.no_26_분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_02 {
    //쿼드트리
    static int[][] board;
    static int zeroCount = 0, oneCount= 0, minusOneCount=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int [n][n];
        StringTokenizer st;

        for(int i  = 0 ; i < n ; i ++ ){
            st = new StringTokenizer(br.readLine());
            for(int j  = 0 ; j < n ; j ++ ) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divideBoard(n,0,0);
        StringBuilder sb = new StringBuilder();
        sb.append(minusOneCount+"\n").append(zeroCount+"\n").append(oneCount+"\n");
        System.out.print(sb);
    }
    public static void divideBoard (int length, int Ystart, int Xstart){
        if(checkBoard(length,Ystart,Xstart)){
            int num = board[Ystart][Xstart];
            if(num == 0) zeroCount++;
            else if(num == 1) oneCount++;
            else minusOneCount++;
        }else{
            int newLength = length/3;
            //1구역
            divideBoard(newLength,Ystart,Xstart);
            //2구역
            divideBoard(newLength,Ystart,Xstart+newLength);
            //3구역
            divideBoard(newLength,Ystart,Xstart+(2*newLength));
            //4구역
            divideBoard(newLength,Ystart+newLength,Xstart);
            //5구역
            divideBoard(newLength,Ystart+newLength,Xstart+newLength);
            //6구역
            divideBoard(newLength,Ystart+newLength,Xstart+(2*newLength));
            //7구역
            divideBoard(newLength,Ystart+(2*newLength),Xstart);
            //8구역
            divideBoard(newLength,Ystart+(2*newLength),Xstart+newLength);
            //9구역
            divideBoard(newLength,Ystart+(2*newLength),Xstart+(2*newLength));
        }
    }

    public static boolean checkBoard(int length, int Ystart, int Xstart){
        int temp = board[Ystart][Xstart];
        for(int i  = Ystart ; i < Ystart+length ; i ++ ){
            for(int j  = Xstart ; j < Xstart+length ; j ++ ) {
                if(board[i][j] != temp){
                    return false;
                }
            }
        }
        return true;
    }
}
