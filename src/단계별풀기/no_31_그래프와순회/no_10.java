package 단계별풀기.no_31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no_10 {
    //숨바꼭질
    static int visited[] = new int[100001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = 0;
        if(start == end) System.out.print(0);
        else {
            while (!q.isEmpty()) {
                int nowIdx = q.poll();
                int nextIdx = 0;
                for (int i = 0; i < 3; i++) {
                    switch (i) {
                        case 0:
                            nextIdx = nowIdx + 1;
                            if (nextIdx > 100000) continue;
                            break;
                        case 1:
                            nextIdx = nowIdx - 1;
                            if (nextIdx < 0) continue;
                            break;
                        case 2:
                            nextIdx = nowIdx * 2;
                            if (nextIdx > 100000) continue;
                            break;
                    }
                    if (nextIdx == end) {
                        System.out.print(visited[nowIdx] + 1);
                        q.clear();
                        break;
                    }
                    if (visited[nextIdx] == 0) {
                        visited[nextIdx] = visited[nowIdx] + 1;
                        q.add(nextIdx);
                    }
                }
            }
        }
    }
}
