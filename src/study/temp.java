package study;
import java.util.*;
import java.io.*;

public class temp{

    static class Node implements Comparable<Node> {

        int index,cost;

        public Node(int index, int cost){
            this.index = index;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o){
            return this.cost - o.cost;
        }
    }

    static int V,E,start;
    static ArrayList<Node>[] graph;
    static int[] distance;

    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(br.readLine());

        graph = new ArrayList[V+1];
        distance = new int[V+1];

        Arrays.fill(distance,Integer.MAX_VALUE);

        for(int i = 1; i <=V ; i ++) graph[i] = new ArrayList<>();

        for(int i  = 0 ; i < E ; i ++){
            st = new StringTokenizer(br.readLine());
            int fromNode = Integer.parseInt(st.nextToken());
            int toNode = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[fromNode].add(new Node(toNode,cost));
        }


        findRoute();
        for(int i = 1 ; i <=V ; i ++){
            if(distance[i] == Integer.MAX_VALUE)System.out.println("INF");
            else System.out.println(distance[i]);
        }
    }

    static void findRoute(){

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(start,0));
        distance[start] = 0;
        while(!queue.isEmpty()){
            Node current = queue.poll();
            int currIdx = current.index;
            int currCost = current.cost;
            for(Node next : graph[currIdx]){
                if(distance[currIdx]<currCost)continue;
                int newCost = next.cost + currCost;
                if(newCost<distance[next.index]){
                    queue.add(new Node(next.index, newCost));
                    distance[next.index] = newCost;
                }
            }
        }
    }
}




