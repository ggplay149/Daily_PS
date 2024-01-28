package 단계별풀기.no_31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no_09 {
    //미로 탐색
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];
        boolean[][]visited = new boolean[n][m];

        for(int i = 0 ; i < n ; i ++ ) {
            String[] input = br.readLine().split("");
            for(int j = 0 ; j < m ; j++){
                if(input[j].equals("1")){
                    board[i][j] = 1;
                }
            }
        }

        int x=0,y=0;
        int[] Xcontrol = {1,-1,0,0};
        int[] Ycontrol = {0,0,1,-1};

        Queue<int[]> q = new LinkedList<>();
        visited[x][y] = true;
        q.add(new int[] {x,y});

        while(!q.isEmpty()){
            int[] temp = q.poll();
            for(int i = 0 ; i < 4 ; i++){
                int nextX = temp[0]+Xcontrol[i];
                int nextY = temp[1]+Ycontrol[i];
                if(nextX<n && nextX>-1 && nextY<m && nextY>-1){
                    if(!visited[nextX][nextY] && board[nextX][nextY] != 0){
                        q.add(new int[] {nextX,nextY});
                        board[nextX][nextY] = board[temp[0]][temp[1]]+1;
                        visited[nextX][nextY] = true;
                    }
                }
            }
        }
        System.out.print(board[n-1][m-1]);
    }
}
