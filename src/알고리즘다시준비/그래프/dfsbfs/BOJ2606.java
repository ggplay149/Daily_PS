package 알고리즘다시준비.그래프.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2606 {

    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int count=0;

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int comNum = Integer.parseInt(br.readLine());
        int netNum = Integer.parseInt(br.readLine());

        visited = new boolean[comNum+1];
        graph = new ArrayList[comNum+1];

        for( int i = 0 ; i <= comNum ; i ++){
           graph[i] = new ArrayList<>();
        }


        for( int i = 1 ; i <= netNum ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph[from].add(to);
            graph[to].add(from);
        }
        dfs(1);
        System.out.print(count);
    }

    static void dfs(int start){
        visited[start] = true;
        ArrayList<Integer> linkedList = graph[start];
        for(int i : linkedList){
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
    }
}