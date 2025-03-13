package study.week1_DFS_BFS.참고문제;

import java.io.*;
import java.util.*;

public class B_BOJ2667 {

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static String[][] board;
    static List<Integer> answerList = new ArrayList<>();
    static Queue<int[]> queue = new LinkedList<>();
    static int count = 0;
    static int n = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        board = new String[n][n];

        for(int i = 0 ; i < n ; i ++ ){
            String input = br.readLine();
            for(int j =0 ; j <  n; j ++){
                board[i][j] = String.valueOf(input.charAt(j));
            }
        }
        for(int i = 0 ; i < n ; i ++ ){
            for(int j =0 ; j <  n; j ++){
                if(board[i][j].equals("1")){
                    bfs(new int[]{i,j});
                    answerList.add(count);
                    count = 0;
                }
            }
        }
        Collections.sort(answerList);
        System.out.println(answerList.size());
        for(int i  : answerList) System.out.println(i);

    }

    public static void bfs(int[] start){

         int y = start[0];
         int x = start[1];

         queue.offer(new int[]{y,x});
         board[y][x] = "0";
         count++;

         while(!queue.isEmpty()){
             int[] current = queue.poll();
             y = current[0];
             x = current[1];

             for(int i = 0 ; i < 4; i ++){
                 int nextY = y+dy[i];
                 int nextX = x+dx[i];
                 if(0 <= nextY && nextY< n && 0 <= nextX && nextX< n){
                     if(board[nextY][nextX].equals("1")) {
                         queue.offer(new int[]{nextY, nextX});
                         board[nextY][nextX] = "0";
                         count++;
                     }
                 }
             }
         }
    }
}
