package 알고리즘다시준비.chap02_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1992 {
    static String[][] board;
    static int n;
    static String answer = "(";
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new String[n][n];

        //board 입력받기
        for(int i = 0 ; i < n ; i ++){
            String[] input = br.readLine().split("");
            for(int j = 0 ; j < n ; j ++){
                board[i][j] = input[j];
            }
        }
        splitFunction(0,0,n);
    }

    //쪼개기용 함수
    public static void splitFunction(int startY, int startX, int length){

        //종료조건
        if (length == 1){
            count(startY, startX);
            return;
        }
        //재귀적 반복
        if(!check(startY,startX,length)){
            length = length/2;
            //북서 체크
            splitFunction(startY,startX,length);
            //북동 체크
            splitFunction(startY,startX+length,length);
            //남서 체크
            splitFunction(startY+length,startX,length);
            //남동 체크
            splitFunction(startY+length,startX+length,length);
        }else{
            count(startY, startX);
        }
    }

    //blue or white count
    static void count(int startY, int startX){
        if(board[startY][startX].equals("1")){
        }else{
        }
    }


    //통일된 색깔인지 확인
    public static boolean check(int startY, int startX, int length){
        for(int i = startY ; i < startY+length ; i ++){
            for(int j = startX ; j < startX+length ; j ++){
                if(!board[i][j].equals(board[startY][startX])) {
                    return false;
                }
            }
        }
        return true;
    }
}
