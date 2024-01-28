package 단계별풀기.no_31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no_11 {
    //나이트의 이동
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for (int n = 0; n < num; n++) {
            int length = Integer.parseInt(br.readLine());
            int[][] board = new int[length][length];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int nowX = Integer.parseInt(st.nextToken());
            int nowY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int toX = Integer.parseInt(st.nextToken());
            int toY = Integer.parseInt(st.nextToken());

            if (nowX == toX && nowY == toY) {
                sb.append(0 + "\n");
            } else {

                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{nowX, nowY});

                while (!q.isEmpty()) {
                    int[] temp = q.poll();
                    nowX = temp[0];
                    nowY = temp[1];
                    int newX = 0, newY = 0;
                    for (int i = 0; i < 8; i++) {
                        switch (i) {
                            case 0:
                                newX = nowX - 2;
                                newY = nowY - 1;
                                break;
                            case 1:
                                newX = nowX - 1;
                                newY = nowY - 2;
                                break;
                            case 2:
                                newX = nowX + 2;
                                newY = nowY + 1;
                                break;
                            case 3:
                                newX = nowX + 1;
                                newY = nowY + 2;
                                break;
                            case 4:
                                newX = nowX + 1;
                                newY = nowY - 2;
                                break;
                            case 5:
                                newX = nowX + 2;
                                newY = nowY - 1;
                                break;
                            case 6:
                                newX = nowX - 1;
                                newY = nowY + 2;
                                break;
                            case 7:
                                newX = nowX - 2;
                                newY = nowY + 1;
                                break;
                        }
                        if (newX > -1 && newX < length && newY > -1 && newY < length && board[newX][newY] == 0) {
                            board[newX][newY] = board[nowX][nowY] + 1;
                            if (newX == toX && newY == toY) {
                                sb.append(board[newX][newY] + "\n");
                                q.clear();
                                break;
                            } else {
                                q.add(new int[]{newX, newY});
                            }
                        }
                    }
                }
            }

        }
        System.out.print(sb);
    }
}
