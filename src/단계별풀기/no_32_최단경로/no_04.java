package 단계별풀기.no_32_최단경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node implements Comparable<Node>{
    int toNode,cost;

    public Node (int toNode,int cost){
        this.toNode = toNode;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return cost-o.cost;
    }
}
public class no_04 {

    private static int INF = 10_000_000;
    private static int nodeNum;
    private static int edgeNum;
    private static ArrayList<ArrayList<Node>> edgeGraph;
    private static int[] minDistance;
    private static boolean[] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int t = 0 ; t < testCase ; t++) {


            st = new StringTokenizer(br.readLine());
            nodeNum = Integer.parseInt(st.nextToken());
            edgeNum = Integer.parseInt(st.nextToken());
            int targetNum = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int startNode = Integer.parseInt(st.nextToken());
            int passedNode1 = Integer.parseInt(st.nextToken());
            int passedNode2 = Integer.parseInt(st.nextToken());


            minDistance = new int[nodeNum + 1];
            Arrays.fill(minDistance,INF);
            visited = new boolean[nodeNum + 1];
            edgeGraph = new ArrayList<>();


            for (int i = 0; i <= nodeNum; i++) {
                edgeGraph.add(new ArrayList<Node>());
            }

            for (int i = 0; i < edgeNum; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());
                edgeGraph.get(from).add(new Node(to,cost));
                edgeGraph.get(to).add(new Node(from,cost));
            }


            int[] targetList = new int[targetNum];
            for (int i = 0; i < targetNum; i++) {
                targetList[i] = Integer.parseInt(br.readLine());
            }

            ArrayList<Integer> answerList = new ArrayList<>();
            for(int target : targetList) {
                int minTemp1 = findMinWay(startNode, passedNode1) + findMinWay(passedNode1, passedNode2) + findMinWay(passedNode2, target);
                int minTemp2 = findMinWay(startNode, passedNode2) + findMinWay(passedNode2, passedNode1) + findMinWay(passedNode1, target);
                int minTemp3 = findMinWay(startNode,target);
                int minTemp4  = Math.min(minTemp2, minTemp1);
                if(minTemp3 == minTemp4) answerList.add(target);
            }
            Collections.sort(answerList);
            for(int ans : answerList) sb.append(ans + " ");
            sb.append("\n");
        }
        System.out.print(sb);
    }
    public static int findMinWay(int start, int end){
        PriorityQueue<Node> q = new PriorityQueue<>();
        Arrays.fill(minDistance,INF);
        Arrays.fill(visited,false);
        minDistance[start] = 0;
        q.add(new Node(start,0));

        while (!q.isEmpty()){
            Node temp = q.poll();
            int currentNode = temp.toNode;
            if(!visited[currentNode]){
                visited[currentNode] = true;
                for(int i = 0 ; i <edgeGraph.get(currentNode).size() ; i++){
                    int nextNode = edgeGraph.get(currentNode).get(i).toNode;
                    int nextCost = edgeGraph.get(currentNode).get(i).cost;
                    if(minDistance[nextNode] > minDistance[currentNode]+nextCost){
                        minDistance[nextNode] = minDistance[currentNode]+nextCost;
                        q.add(new Node(nextNode,minDistance[currentNode]+nextCost));
                    }
                }
            }
        }
        return minDistance[end];
    }
}