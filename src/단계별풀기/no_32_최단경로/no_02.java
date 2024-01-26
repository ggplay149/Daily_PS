package 단계별풀기.no_32_최단경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no_02 {
    private static int[] minDistance;
    private static List<Node>[] list;

    private static int nodeNum;
    private static int edgeNum;
    private static int INF;

    private static class Node implements Comparable<Node> {
        int end, weight;

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        nodeNum = Integer.parseInt(st.nextToken());
        edgeNum = Integer.parseInt(st.nextToken());

        minDistance = new int[nodeNum + 1];
        list = new List[nodeNum + 1];

        INF = 200_000_000;

        for (int i = 1; i <= nodeNum; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < edgeNum; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int fromToWeight = Integer.parseInt(st.nextToken());
            list[from].add(new Node(to, fromToWeight));
            list[to].add(new Node(from, fromToWeight));
        }

        st = new StringTokenizer(br.readLine());

        int mustGo1 = Integer.parseInt(st.nextToken());
        int mustGo2 = Integer.parseInt(st.nextToken());

        long case1 = Dijkstra(1, mustGo1) + Dijkstra(mustGo1, mustGo2) + Dijkstra(mustGo2, nodeNum);
        long case2 = Dijkstra(1, mustGo2) + Dijkstra(mustGo2, mustGo1) + Dijkstra(mustGo1, nodeNum);

        if(Math.min(case1,case2)>=INF) System.out.print(-1);
        else System.out.print(Math.min(case1,case2));


    }

    public static int Dijkstra(int from, int to) {
        Arrays.fill(minDistance, INF);
        minDistance[from] = 0;


        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(from, 0));


        while (!q.isEmpty()) {
            Node temp = q.poll();
            int currNode = temp.end;
            int currWeight = temp.weight;
            int nextNode = 0;
            int WeightToNextNode = 0;
            if(minDistance[currNode]<currWeight)continue;
            //if(minDistance[currNode]>currWeight) {
            for (Node n : list[currNode]) {
                    nextNode = n.end;
                    WeightToNextNode = n.weight;
                    if (minDistance[nextNode] > currWeight + WeightToNextNode) {
                        minDistance[nextNode] = currWeight + WeightToNextNode;
                        q.add(new Node(nextNode, currWeight + WeightToNextNode));
                    }
            }
           //}
        }
        return minDistance[to];
    }

}
