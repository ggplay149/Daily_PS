import java.util.*;
import java.io.*;

public class no_08{
    //스타트와 링크

    //선언부
    static int n;                   //총인원
    static int sumTemp;             //팀별 조합 점수 합
    static int min=100000;          //최소값
    static int[] caseArr;           //인원 조합 경우의수
    static int[] twoCaseArr;        //caseArr별 두명 조합 경우의 수
    static int[][] board;           //조합 점수표
    static boolean[] visit;         //dfs 조건 구분용
    static boolean[] visitCase;     //2인조합 dfs 조건 구분용

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //총인원 입력받기
        n = Integer.parseInt(br.readLine());

        //초기화
        board = new int[n][n];
        caseArr = new int[n];
        visit = new boolean[n];
        twoCaseArr = new int[2];
        visitCase = new boolean[n/2];

        //조합 점수표 입력받기
        for(int i = 0 ; i < n ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j ++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // n/2 인원조합 경우의 수 찾기
        dfs(0,0);

        //두팀 갭차이 최소값 출력
        System.out.print(min);
    }

    // (n/2)개로 이루어진 중복없는 경우의 수 구한후
    public static void dfs(int at,int depth){

        //각팀별 점수구하기
        if(depth==n/2){

            int[] teamStart = new int[n/2];
            int[] teamLink = new int[n/2];
            int teamStartSum = 0;
            int teamLinkSum = 0;

            //스타트팀 만들기
            for(int i = 0 ; i < n/2 ; i ++)  teamStart[i] = caseArr[i];

            //중복피해서 링크팀 만들기
            int count = 0;
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n/2 ; j ++){
                    if(teamStart[j]==i) break;
                    if(j == (n/2)-1) teamLink[count++]= i;
                }
            }

            //스타트팀 점수
            dfsTwoPerson(teamStart,0);
            teamStartSum = sumTemp;
            sumTemp = 0;

            //링크팀 점수
            dfsTwoPerson(teamLink,0);
            teamLinkSum = sumTemp;
            sumTemp = 0;

            //최소값 갱신
            if(min>(Math.abs(teamStartSum-teamLinkSum))) min = Math.abs(teamStartSum-teamLinkSum);

            //다음 경우의수
            return;
        }

        //중복없는 n/2인 경우의 수 구하기
        for(int i = at ; i < n ; i ++) {
            if (!visit[i]) {
                visit[i] = true;
                caseArr[depth] = i;
                dfs(i+1,depth + 1);
                visit[i] = false;
            }
        }
    }

    //경우의수별 점수 합계
    public static void dfsTwoPerson(int[] temp,int depth){
        if(depth==2){
            sumTemp += board[twoCaseArr[0]][twoCaseArr[1]];
            return;
        }
        for(int i = 0 ; i < n/2 ; i ++) {
            if (!visitCase[i]) {
                visitCase[i] = true;
                twoCaseArr[depth] = temp[i];
                dfsTwoPerson(temp,depth + 1);
                visitCase[i] = false;
            }
        }
    }
}