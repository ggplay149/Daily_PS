package 단계별풀기.no_22_백트랙킹;

import java.io.IOException;
import java.util.Scanner;

public class no_06{
    //스도쿠
    static int[][] arr;
    public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        arr = new int [9][9];
        for(int i = 0 ; i < 9 ; i ++ ){
            for(int j = 0 ; j < 9 ; j ++ ){
                arr[i][j]= sc.nextInt();
            }
        }
        dfs(0,0);
    }

    private static void dfs(int row, int col){
        //
        if(col==9) {
            dfs(row+1,0);
            return;
        }
        //
        if(row==9){
            for(int i = 0 ; i < 9 ; i ++ ){
                for(int j = 0 ; j < 9 ; j ++ ){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }
        //좌표가 0이면 1~9까지 대입
        if(arr[row][col]==0){
            for(int i = 1 ; i <= 9 ; i ++ ) {
                //들어갈수있는지 체크
                if (check(i, row, col)) {
                    //들어갈수있다면 추가 후 행한칸 추가
                    arr[row][col] = i;
                    dfs(row ,col+1);
                }
            }
            //들어갈 숫자가 없다면
            arr[row][col]=0;
            return;
        }
        //좌표가 0이 아니면 그냥 행한칸 추가
        dfs(row,col+1);
    }

    //숫자들어올수잇는지 체크
    private static boolean check(int num,int row, int col){

        //행,열 중복검사
        for(int i = 0 ; i < 9 ; i ++ ){
            if(arr[row][i]==num) {
                return false;
            }
            if(arr[i][col]==num) {
                //System.out.println("y에서 걸림");
                return false;
            }
        }

        //박스영역 검사
        boolean boxChk =false;
        if(row/3==0){
            if(col/3==0){
                boxChk = boxCheck(num,0,0);
            }else if(col/3==1){
                boxChk = boxCheck(num,0,1);
            }else if(col/3==2){
                boxChk = boxCheck(num,0,2);
            }
        }else if(row/3==1){
            if(col/3==0){
                boxChk = boxCheck(num,1,0);
            }else if(col/3==1){
                boxChk =  boxCheck(num,1,1);
            }else if(col/3==2){
                boxChk =  boxCheck(num,1,2);
            }
        }else if(row/3==2){
            if(col/3==0){
                boxChk =  boxCheck(num,2,0);
            }else if(col/3==1){
                boxChk = boxCheck(num,2,1);
            }else if(col/3==2){
                boxChk = boxCheck(num,2,2);
            }
        }
        if(boxChk == false){
            return false;
        }
        //다통과하면 들어올수잇음
        return true;
    }

    //박스영역 체크
    private static boolean boxCheck(int num, int row, int col){
        for(int i = 0 ; i < 3 ; i ++ ){
            for(int j = 0 ; j < 3 ; j ++ ){
                if(arr[(row*3)+i][(col*3)+j]==num) {
                    return false;
                }
            }
        }
        return true;
    }
}
