package Programmers.dfs_bfs;

import java.util.ArrayList;
import java.util.Collections;

public class lv3_여행경로 {

    static boolean visited[];
    static ArrayList<String> allRoute;

    public String[] solution(String[][] tickets) {

        visited = new boolean[tickets.length];
        allRoute = new ArrayList<>();

        dfs(tickets,"ICN","ICN",0);
        Collections.sort(allRoute);

        String[] answer = allRoute.get(0).split(" ");

        return answer;
    }
    public static void dfs(String[][] tickets, String start, String route, int depth){
        if(depth == tickets.length){
            allRoute.add(route);
            return;
        }
        for(int i = 0 ; i < tickets.length; i ++){
            if(tickets[i][0].equals(start) && !visited[i]){
                visited[i]=true;
                dfs(tickets,tickets[i][1],route+" "+tickets[i][1],depth+1);
                visited[i]=false;
            }
        }
    }
}
