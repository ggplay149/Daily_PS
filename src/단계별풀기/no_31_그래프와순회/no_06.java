package 단계별풀기.no_31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no_06 {
    //DFS와 BFS
    static StringBuilder sb = new StringBuilder();
    static List<ArrayList<Integer>> graph;
    static boolean[] visitDFS;
    static boolean[] visitBFS;
    static ArrayList<Integer> visitNumDFS = new ArrayList<>();
    static ArrayList<Integer> visitNumBFS = new ArrayList<>();
    static int count=1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        visitBFS = new boolean[n+1];
        visitDFS = new boolean[n+1];

        //배열안에 배열로 초기화
        for(int i = 0 ; i <= n ; i ++){
            graph.add(new ArrayList<Integer>());
        }

        //노드별로 인접 노드 넣어주기
        for(int i = 0 ; i < m ; i ++){
            st = new StringTokenizer(br.readLine());
            int fromNode= Integer.parseInt(st.nextToken());
            int toNode = Integer.parseInt(st.nextToken());
            graph.get(fromNode).add(toNode);
            graph.get(toNode).add(fromNode);
        }

        for(int i = 1 ; i <= n ; i ++){
            Collections.sort(graph.get(i));
        }

        dfs(r);
        for(int i = 0 ; i < visitNumDFS.size() ; i ++){
            sb.append(visitNumDFS.get(i)).append(" ");
        }
        sb.append("\n");
        count =1;
        bfs(r);
        for(int i = 0 ; i < visitNumBFS.size() ; i ++){
            sb.append(visitNumBFS.get(i)).append(" ");
        }

        System.out.print(sb);
    }

    private static void dfs(int start){
        visitDFS[start] = true;
        visitNumDFS.add(start);
        for(int i = 0 ; i < graph.get(start).size();i++){
            int idx =graph.get(start).get(i);
            if(!visitDFS[idx]){
                dfs(idx);
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        visitBFS[start] = true;
        visitNumBFS.add(start);
        queue.add(start);
        while(!queue.isEmpty()){
            int p = queue.poll();
            for(int i = 0 ; i < graph.get(p).size();i++){
                int idx = graph.get(p).get(i);
                if(!visitBFS[idx]){
                    visitBFS[idx] = true;
                    visitNumBFS.add(idx);
                    queue.add(idx);
                }
            }
        }
    }
}
