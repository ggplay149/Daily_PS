package 알고리즘다시준비.그래프.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1926 {

    static String[][] board;
    static boolean[][] visited;
    static int count;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        board = new String[y][x];
        visited = new boolean[y][x];

        for(int i = 0 ; i < y ; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < x ; j ++){
                board[i][j] = st.nextToken();
            }
        }

        List<Integer> sizeList = new ArrayList<>();
        int maxSize = 0;
        int pictureCount = 0;

        for(int i = 0 ; i < y ; i ++){
            for(int j = 0 ; j < x ; j ++){
                if(board[i][j].equals("1")&& !visited[i][j]){
                    count=0;
                    dfs(i,j);
                    pictureCount++;
                    maxSize = Math.max(maxSize,count);
                }
            }
        }
        System.out.println(pictureCount);
        System.out.println(maxSize);
    }

    static void dfs(int y, int x){
        //방문체크
        visited[y][x] = true;
        count++;
        int nextY = 0, nextX = 0;
        for(int i = 0 ; i < 4 ; i ++) {
            nextY = y+ dy[i];
            nextX = x+ dx[i];

            //범위밖인지 체크 후 dfs 재귀 호출
            if( nextY >=0 && nextY< board.length && nextX>=0 && nextX< board[0].length ){
                if( board[nextY][nextX].equals("1") &&!visited[nextY][nextX]){
                    dfs(nextY,nextX);
                }
            }
        }
    }
}
