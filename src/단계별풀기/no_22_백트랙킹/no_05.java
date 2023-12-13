package 단계별풀기.no_22_백트랙킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class no_05{
    // N-Queen

    private static int n;
    private static int result=0;
    private static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dfs(0);
        System.out.println(result);

    }

    private static void dfs(int depth){
        if(n==depth) {
            result++;
            return;
        }
        for(int i = 0; i<n ;i ++){
            arr[depth]=i;
            if(check(depth)){
                dfs(depth+1);
            }
        }
    }

    private static boolean check(int col){

        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            }
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }        }
        return true;
    }
}
