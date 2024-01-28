package 단계별풀기.no_31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_08 {
    //유기농 배추
    static boolean[][] visited;
    static boolean[][] board;
    static int count=0;
    static int n;
    static int m;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int a = 0 ; a < input ; a++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            visited = new boolean[n][m];
            board = new boolean[n][m];

            for(int i = 0 ; i < k ; i ++){
                st = new StringTokenizer(br.readLine());
                board[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
            }

            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < m ; j ++){
                    if(!visited[i][j] && board[i][j]){
                        dfs(i,j);
                        count++;
                    }
                }
            }
            sb.append(count+"\n");
            count =0;
        }
        System.out.print(sb);
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i = 0 ; i < 4 ; i ++){
            int newX = x;
            int newY = y;
            switch(i){
                case 0 :
                    newX = x+1;
                    break;
                case 1 :
                    newX = x-1;
                    break;
                case 2 :
                    newY = y+1;
                    break;
                case 3 :
                    newY = y+-1;
                    break;
            }
            if(newX<n && newY<m && newX>-1 && newY>-1){
                if(!visited[newX][newY] && board[newX][newY]){
                    dfs(newX,newY);
                }
            }
        }
    }
}
