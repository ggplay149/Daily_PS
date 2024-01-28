package 단계별풀기.no_31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no_12 {
    //토마토
    static int[][] box;
    static int x;
    static int y;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        box = new int[y][x];

        Queue<int[]> q = new LinkedList<>();
        int emptyCount = 0;

        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < x; j++) {
                int input = Integer.parseInt(st.nextToken());
                box[i][j] = input;
                if (input == 1) {
                    int[] temp = {i, j};
                    q.add(temp);
                } else if (input == -1) {
                    emptyCount++;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] t = q.poll();
            int nowX = t[0];
            int nowY = t[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX;
                int nextY = nowY;

                switch (i) {
                    case 0:
                        nextX++;
                        break;
                    case 1:
                        nextX--;
                        break;
                    case 2:
                        nextY++;
                        break;
                    case 3:
                        nextY--;
                        break;
                }

                if (nextX < y && nextX > -1 && nextY < x && nextY > -1) {
                    if (box[nextX][nextY] == 0) {
                        box[nextX][nextY] = box[nowX][nowY] + 1;
                        int[] tmp = {nextX, nextY};
                        q.add(tmp);
                    }
                }
            }
        }

        int max = -1000000;
        boolean zeroChk = false;

        loopOut:
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (box[i][j] > max) max = box[i][j];
                if (box[i][j] == 0) {
                    zeroChk = true;
                    break loopOut;
                }
            }
        }

        if (zeroChk) System.out.print(-1);
        else System.out.print(max-1);

    }
}
