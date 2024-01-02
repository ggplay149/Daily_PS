package 단계별풀기.no_26_분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_01 {
    //색종이 만들기
    static int n = 0;
    static int[][] board;
    static int blueCheck = 0, whiteCheck = 0;
    static int Ystart = 0, Xstart = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        StringTokenizer st;

        //보드입력
        for(int i = 0 ; i < n ; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j ++) {
                board[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        divideBoard(n,0,0);

        System.out.println(blueCheck);
        System.out.println(whiteCheck);

    }

    public static void divideBoard(int length, int Ystart, int Xstart){

        if(!checkBoard(length,Ystart,Xstart)){
            //1영역
            divideBoard(length/2,Ystart,Xstart);
            //2영역
            divideBoard(length/2,Ystart,Xstart+(length/2));
            //3영역
            divideBoard(length/2,Ystart+(length/2),Xstart);
            //4영역
            divideBoard(length/2,Ystart+(length/2),Xstart+(length/2));
        }else{
            if(board[Ystart][Xstart]==1) whiteCheck++;
            else blueCheck++;
        }
    }

    public static boolean checkBoard(int length, int Ystart, int Xstart ){
        int checkNum = board[Ystart][Xstart];
        for(int i = Ystart ; i < Ystart+length ; i ++){
            for(int j = Xstart ; j < Xstart+length ; j ++) {
                if(checkNum!=board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
