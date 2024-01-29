package 단계별풀기.no_32_최단경로;

import java.io.*;
import java.util.*;

public class no_03 {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int START = Integer.parseInt(st.nextToken());
            int END = Integer.parseInt(st.nextToken());
            if (END < START) {
                System.out.print(START - END);
            } else if (END == START) {
                System.out.print(0);
            } else {
                int INF = 12;
                int[] minSeconds = new int[INF + 1];
                minSeconds[START] = 0;
                Arrays.fill(minSeconds, INF);
                for(int i = 1 ; i <= INF ; i ++){
                    if(i%START == 0 && (i/START)%2==0){
                        minSeconds[i] = 0;
                    }
                }

                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{START, 0});

                while (!q.isEmpty()) {
                    int[] temp = q.poll();
                    int currNode = temp[0];
                    int secondsSoFar = temp[1];
                    for (int i = 0; i < 3; i++) {
                        int nextNode = 0;
                        int secondsToNextNode = 0;
                        if(currNode%START == 0 && (currNode/START)%2==0){
                            secondsSoFar = 0;
                        }
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

                            System.out.println("nextNode = " + nextNode);
                            System.out.println("secondsToNextNode = " + secondsToNextNode);
                            if (minSeconds[nextNode] > secondsToNextNode) {
                                System.out.println("addNode = " + nextNode);
                                System.out.println("addToNextNode = " + secondsToNextNode);
                                minSeconds[nextNode] = secondsToNextNode;
                                q.add(new int[]{nextNode, secondsToNextNode});
                            }
                            System.out.println(" ======================= " );
                        }

                    }
                }
                System.out.print(minSeconds[END]);
            }
        }
    }
}