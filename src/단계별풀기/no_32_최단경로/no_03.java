package 단계별풀기.no_32_최단경로;
import java.io.*;
import java.util.*;

public class no_03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int START = Integer.parseInt(st.nextToken());
        int END = Integer.parseInt(st.nextToken());
        if (END < START) {
            System.out.print(START - END);
        } else if (END == START) {
            System.out.print(0);
        } else {
            int INF = 100_000;
            int[] minSeconds = new int[INF + 1];
            minSeconds[START] = 0;
            Arrays.fill(minSeconds, INF);
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{START, 0});
            while (!q.isEmpty()) {
                int[] temp = q.poll();
                int currNode = temp[0];
                int secondsSoFar = temp[1];
                for (int i = 0; i < 3; i++) {
                    int nextNode = 0;
                    int secondsToNextNode = 0;
                    switch (i) {
                        case 0:
                            nextNode = 2 * currNode;
                            secondsToNextNode = secondsSoFar;
                            break;
                        case 1:
                            nextNode = currNode + 1;
                            secondsToNextNode = secondsSoFar + 1;
                            break;
                        case 2:
                            nextNode = currNode - 1;
                            secondsToNextNode = secondsSoFar + 1;
                            break;
                    }
                    if (nextNode > 0 && nextNode <= INF) {
                        if (minSeconds[nextNode] > secondsToNextNode) {
                            minSeconds[nextNode] = secondsToNextNode;
                            q.add(new int[]{nextNode, secondsToNextNode});
                        }
                    }
                }
            }
            System.out.print(minSeconds[END]);
        }
    }
}