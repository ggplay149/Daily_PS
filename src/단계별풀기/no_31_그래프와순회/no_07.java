package 단계별풀기.no_31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class no_07 {
    // 단지번호 붙이기
    static int n;
    static boolean[][] board;
    static boolean[][] visited;
    static int count = 0;
    static ArrayList<Integer> numArr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        board = new boolean[n][n];
        visited = new boolean[n][n];

        for(int i = 0 ; i < n ; i++){
            String[] arr = br.readLine().split("");
            for(int j = 0 ; j < n ; j++){
                if(arr[j].equals("1")){
                    board[i][j] = true;
                }
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(!visited[i][j] && board[i][j]){
                    dfs(i,j);
                    count++;
                    numArr.add(count);
                    count=0;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(numArr.size()+"\n");
        Collections.sort(numArr);
        for(int i : numArr){
            sb.append(i+"\n");
        }
        System.out.print(sb);


    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i = 0 ; i < 4 ; i ++){
            int newX = x;
            int newY = y;
            switch(i){
                case 0 :
                    newX = x+1;
                    break;
                case 1 :
                    newX = x-1;
                    break;
                case 2 :
                    newY = y+1;
                    break;
                case 3 :
                    newY = y+-1;
                    break;
            }
            if(newX<n && newY<n && newX>-1 && newY>-1){
                if(!visited[newX][newY] && board[newX][newY]){
                    dfs(newX,newY);
                    count++;
                }
            }
        }
    }
}
