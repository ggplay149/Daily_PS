package 단계별풀기.no_31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int snakeNum = Integer.parseInt(st.nextToken());
        int ladderNum = Integer.parseInt(st.nextToken());

        int[][] snake = new int[101][1];
        int[][] ladder = new int[101][1];

        for (int i = 0; i < ladderNum; i++) {
            st = new StringTokenizer(br.readLine());
            ladder[Integer.parseInt(st.nextToken())][0] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < snakeNum; i++) {
            st = new StringTokenizer(br.readLine());
            snake[Integer.parseInt(st.nextToken())][0] = Integer.parseInt(st.nextToken());
        }

        int[] board = new int[101];

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while (!q.isEmpty()) {
            int now = q.poll();
            int next = 0;
            for (int i = 0; i < 6; i++) {
                switch (i) {
                    case 0:
                        next = now + 1;
                        break;
                    case 1:
                        next = now + 2;
                        break;
                    case 2:
                        next = now + 3;
                        break;
                    case 3:
                        next = now + 4;
                        break;
                    case 4:
                        next = now + 5;
                        break;
                    case 5:
                        next = now + 6;
                        break;
                }
                if (next > 0 && next < 101) {
                    if (ladder[next][0] != 0) {
                        next = ladder[next][0];
                    } else if (snake[next][0] != 0) {
                        next = snake[next][0];
                    }
                    if (board[next] == 0) {
                        board[next] = board[now] + 1;
                        q.add(next);
                    }
                }
            }
        }
        System.out.print(board[100]);
    }
}
