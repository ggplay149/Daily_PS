package Programmers.완전탐색;
public class lv2_피로도 {
    static boolean[] visited;
    static int max =Integer.MIN_VALUE;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k,dungeons,0);
        return max;
    }

    public void dfs(int k, int[][] dungeons,int count){
        if(max < count) max = count;
        for(int i = 0 ; i < dungeons.length ; i ++){
            if(
                    !visited[i]
                            && k >= dungeons[i][0]
            ){
                visited[i] = true;
                dfs(k-dungeons[i][1],dungeons,count+1);
                visited[i] = false;
            }
        }
    }
}
