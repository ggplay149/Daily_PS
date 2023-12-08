package 단계별풀기.no_22_백트랙킹;

import java.io.*;
import java.util.*;
public class no_05{

    //공통
    private static int n;
    private static int [][] board;
    private static int xCount=0;
    private static int caseCount=0;
    private static int result=0;

    //경우의수 찾기
    private static int[] arr;
    private static boolean[] visit;
    private static List<int[]> caseList = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        arr = new int[n];
        visit = new boolean[n];
        boardReset();
        dfs(0);
        check();
        System.out.println(result);


        //경우의 수 저장확인
        int countTest = 0;
        for(int i = 0; i <caseList.size();i++){
            System.out.print(caseList.get(i)[0]+","+caseList.get(i)[1]+" ");
            countTest++;
            if(countTest==n) {
                countTest=0;
                System.out.print("\n");
            }
        }
    }


    //===함수영역===

    //dfs로 n개 퀸위치 경우의 수 다찾기
    private static void dfs(int depth){
        if(n==depth) {
            for(int a : arr){
                int[] input = {xCount,a};
                caseList.add(input);
                if(xCount==(n-1))xCount=0;
                else xCount++;
            }
            return;
        }
        for(int i = 0; i<n ;i ++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth] = i;
                dfs(depth+1);
                visit[i]=false;
            }
        }
    }

    //찾은 경우의 수대로 중복횟수 찾기
    private static void check(){
        for(int i = 0 ; i < caseList.size() ; i++) {
            int x = caseList.get(i)[0];
            int y = caseList.get(i)[1];

            if(caseCount==n) result++;

            if(board[x][y]==1) {
                boardReset();
                i = i+(n-caseCount-1);
                if(i>caseList.size()) break;
                caseCount=0;
                continue;
            }

            caseCount++;

            board[x][y]=1;
            int xTemp = 0;
            int yTemp = 0;

            //공격범위 세로칠하기
            for(int a = 0 ; a < n ; a++) {
                if(y!=a)board[x][a]=1;
            }
            //공격범위 가로칠하기
            for(int a = 0 ; a < n ; a++) {
                if(x!=a)board[a][y]=1;
            }
            //공격범위 좌상향칠하기
            for(int a = 1 ; a < n ; a++) {
                xTemp = x-a;
                yTemp = y-a;
                if(xTemp >=0 && yTemp>=0) board[xTemp][yTemp]=1;
            }
            //공격범위 좌하향칠하기
            for(int a = 1 ; a < n ; a++) {
                xTemp = x-a;
                yTemp = y+a;
                if(xTemp >=0 && yTemp<n) board[xTemp][yTemp]=1;
            }
            //공격범위 우상향칠하기
            for(int a = 1 ; a < n ; a++) {
                xTemp = x+a;
                yTemp = y-a;
                if(xTemp <n && yTemp>=0) board[xTemp][yTemp]=1;
            }
            //공격범위 우하향칠하기
            for(int a = 1 ; a < n ; a++) {
                xTemp = x+a;
                yTemp = y+a;
                if(xTemp <n && yTemp<n) board[xTemp][yTemp]=1;
            }
            //boardPrint();
        }

    }

    //판리셋
    private static void boardReset(){
        for(int i=0;i <n;i++){
            for(int j=0;j <n;j++) {
                board[i][j]=0;
            }
        }
    }
    //판체크 전부1이면 true 아니면 false
    private static boolean boardCheck(){
        for(int i=0;i <n;i++){
            for(int j=0;j <n;j++) {
                if(board[i][j]!=1) {
                    return false;
                }
            }
        }
        return true;
    }
    //판출력
    private static void boardPrint(){
        for(int i=0;i <n;i++){
            for(int j=0;j <n;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
