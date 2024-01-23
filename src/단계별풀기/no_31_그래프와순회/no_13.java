package 단계별풀기.no_31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no_13 {
    //토마토2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[][][] board = new int[h][m][n];
        int[][][] visited = new int[h][m][n];
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < n; k++) {
                    int temp = Integer.parseInt(st.nextToken());
                    board[i][j][k] = temp;
                    if (temp == 1) {
                        q.add(new int[]{i, j, k});
                        visited[i][j][k] = 1;
                    }
                }
            }
        }
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int nowZ = temp[0];
            int nowX = temp[1];
            int nowY = temp[2];
            int newZ = 0;
            int newX = 0;
            int newY = 0;
            for (int i = 0; i < 6; i++) {
                switch (i) {
                    case 0:
                        newZ = nowZ + 1;
                        newX = nowX;
                        newY = nowY;
                        break;
                    case 1:
                        newZ = nowZ - 1;
                        newX = nowX;
                        newY = nowY;
                        break;
                    case 2:
                        newX = nowX + 1;
                        newZ = nowZ;
                        newY = nowY;
                        break;
                    case 3:
                        newX = nowX - 1;
                        newZ = nowZ;
                        newY = nowY;
                        break;
                    case 4:
                        newY = nowY + 1;
                        newX = nowX;
                        newZ = nowZ;
                        break;
                    case 5:
                        newY = nowY - 1;
                        newX = nowX;
                        newZ = nowZ;
                        break;
                }
                if (newZ > -1 && newZ < h
                        && newX > -1 && newX < m
                        && newY > -1 && newY < n) {
                    if (visited[newZ][newX][newY] == 0 && board[newZ][newX][newY] ==0) {
                        board[newZ][newX][newY] = board[nowZ][nowX][nowY] + 1;
                        visited[newZ][newX][newY] = 1;
                        q.add(new int[]{newZ, newX, newY});
                    }
                }
            }
        }

        boolean zeroChk = false;
        int max = -1000000;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < m; j++) {
               for (int k = 0; k < n; k++) {
                    if(board[i][j][k] == 0 ) zeroChk = true;
                    if(max<board[i][j][k]) max =board[i][j][k];
                }
            }
        }
        if(zeroChk) System.out.print(-1);
        else System.out.print(max-1);
    }
}

