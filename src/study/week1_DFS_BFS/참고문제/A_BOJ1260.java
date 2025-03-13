package study.week1_DFS_BFS.참고문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A_BOJ1260 {

    static int nodes;
    static int edges;
    static int start;
    static int[][] graph;
    static boolean[] visited;
    static int count = 0;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        nodes = Integer.parseInt(st.nextToken());
        edges = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        graph = new int[nodes+1][nodes+1];
        visited = new boolean[nodes+1];

        for(int i = 0 ; i < edges ; i ++ ){

            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            graph[y][x] = 1;

        }

        dfs(start);
        System.out.println();
        visited = new boolean[1001];
        bfs(start);

    }

    static void dfs(int num){
        visited[num] = true;
        System.out.print(num+" ");

        if(count == nodes){
            return;
        }

        for(int i = 1 ; i <= nodes ; i ++){
            if(visited[i] == false && graph[num][i] == 1){
                dfs(i);
            }
        }
    }

    static void bfs(int num){
        q.offer(num);
        visited[num] = true;
        System.out.print(num + " ");

        while(!q.isEmpty()){
            int start = q.poll();
            for(int i = 1 ; i <= nodes ; i ++){
                if(visited[i] == false && graph[start][i] == 1){
                    q.offer(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }

        }
    }
}
