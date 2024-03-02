package Programmers.dfs_bfs;

public class lv3_네트워크 {
    static int answer = 0;
    static boolean[] connected;

    public int solution(int n, int[][] computers) {
        connected = new boolean[n];
        answer = n;
        for(int i = 0 ; i < n ; i ++){
            dfs(computers,i,n);
        }
        return answer;
    }

    public void dfs(int[][] computers, int comNum, int n){
        for(int i = 0 ; i < n ; i ++){
            if(comNum != i && computers[comNum][i] == 1 && !connected[i]){
                connected[comNum] = true;
                connected[i] = true;
                answer--;
                dfs(computers,i,n);
            }
        }
    }
}
