package 단계별풀기.no_22_백트랙킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class test {

    //공통
    private static int n;
    private static int [][] board;
    private static int xCount=0;
    private static int caseCount=0;
    private static int result=0;
    //경우의수 찾기
    private static int[] arr;
    private static boolean[] visit;
    private static List<int[]> caseList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        arr = new int[n];
        visit = new boolean[n];

        dfs(0);
        //check();
        int countTest = 0;
        for(int i = 0; i <caseList.size();i++){
            System.out.print(caseList.get(i)[0]+","+caseList.get(i)[1]+" ");
            countTest++;
            if(countTest==n) {
                countTest=0;
                System.out.print("\n");
            }
        }

    }
    private static void dfs(int depth){
        if(n==depth) {
            for(int a : arr){
                int[] input = {xCount,a};
                caseList.add(input);
                if(xCount==(n-1))xCount=0;
                else xCount++;
            }
            return;
        }
        for(int i = 0; i<n ;i ++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth] = i;
                dfs(depth+1);
                visit[i]=false;
            }
        }
    }
}
