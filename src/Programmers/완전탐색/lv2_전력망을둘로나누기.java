package Programmers.완전탐색;

import java.util.ArrayList;
import java.util.List;

public class lv2_전력망을둘로나누기 {

    static boolean[] visited;
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {

        int n = 9;
        //int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
        int[][] wires ={{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}};



        //그래프 셋팅
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        //wires 표현
        for(int[] wire : wires){
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        int min = Integer.MAX_VALUE;

        for(int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
                visited = new boolean[n+1];
                int v1Count = dfs(v1,v2);
                visited = new boolean[n+1];
                int v2Count = dfs(v2,v1);
                min = Math.min(min,Math.abs(v1Count-v2Count));
        }
        System.out.println(min);

    }


    public static int dfs(int node, int skip){
        visited[node] = true;
        int count = 1;
        for(int next : graph.get(node)){
            if(visited[next] || next == skip) continue;
            count += dfs(next,skip);
        }
        return count;
    }
}
