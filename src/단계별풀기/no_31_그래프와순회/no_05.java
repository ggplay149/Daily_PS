package 단계별풀기.no_31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no_05 {
    //바이러스
    static StringBuilder sb = new StringBuilder();
    static List<ArrayList<Integer>> graph;
    static boolean[] visit;
    static int[] visitNum;
    static int count=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        visit = new boolean[n+1];
        visitNum = new int[n+1];



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

        bfs(1);
        System.out.print(count);
    }

    public static void bfs(int start ){
        Queue<Integer> queue = new LinkedList<>();
        visit[start] = true;
        queue.add(start);
        while(!queue.isEmpty()){
            int p = queue.poll();
            for(int i = 0 ; i < graph.get(p).size();i++){
                int idx = graph.get(p).get(i);
                if(!visit[idx]){
                    visit[idx] = true;
                    count++;
                    queue.add(idx);
                }
            }
        }
    }
}
