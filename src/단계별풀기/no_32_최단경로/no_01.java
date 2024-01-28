package 단계별풀기.no_32_최단경로;

import java.io.*;
import java.util.*;

public class no_01 {
    //최단경로
    private static class Node implements Comparable<Node> {
        int end, weight;

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node o) {
            return weight-o.weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nodeNum = Integer.parseInt(st.nextToken());
        int edgeNum = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(br.readLine());

        List<Node>[] list = new List[nodeNum + 1];
        int[] minDisatnce = new int[nodeNum + 1];
        boolean[] visited = new boolean[nodeNum + 1];

        Arrays.fill(minDisatnce, 100_000_000);

        for (int i = 1; i <= nodeNum; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < edgeNum; i++) {
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            list[node].add(new Node(end, weight));
        }


        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(startNode, 0));
        minDisatnce[startNode] = 0;

        while (!q.isEmpty()) {
            Node temp = q.poll();
            int currNode = temp.end;
            int nextNode = 0;
            int nextWeight = 0;

            if (!visited[currNode]) {
                visited[currNode] = true;
                for (int i = 0; i < list[currNode].size(); i++) {
                    nextNode = list[currNode].get(i).end;
                    nextWeight = list[currNode].get(i).weight;
                    if( minDisatnce[nextNode]> minDisatnce[currNode]+ nextWeight){

                        minDisatnce[nextNode] = minDisatnce[currNode]+ nextWeight;
                        q.add(new Node(nextNode,minDisatnce[nextNode]));

                    }
                }
            }
        }

        for(int i =1 ; i <minDisatnce.length ; i ++){
            if(minDisatnce[i] == 100000000) bw.write("INF\n");
            else bw.write(minDisatnce[i] + " \n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
