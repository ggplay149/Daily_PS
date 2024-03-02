package Programmers.dfs_bfs;

public class lv2_타겟넘버 {
    static int count = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;

        dfs(numbers,target,0,0,numbers[0]);
        dfs(numbers,target,0,0,0-numbers[0]);

        return count;
    }

    public void dfs(int[] numbers, int target, int sum, int depth, int value){
        sum += value;
        depth++;
        if(numbers.length == depth){
            if(target == sum) count++;
            sum -= value;
            depth--;
            return;
        }
        dfs(numbers,target,sum,depth,numbers[depth]);
        dfs(numbers,target,sum,depth,0-numbers[depth]);
    }
}
