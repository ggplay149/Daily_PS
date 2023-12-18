package 단계별풀기.no_21_재귀;

import java.io.*;

public class no_06 {
    // 별 찍기 - 10
    static int n;
    static String[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        br.close();

        board = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = "*";
            }
        }

        space(0,0,n,false);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(board[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    static void space(int x, int y, int n, boolean blank) {

        if(blank){
            for(int i = x ; i < x+n ; i++){
                for(int j = y ; j < y+n ; j++) {
                    board[i][j]=" ";
                }
            }

            return;
        }

        if(n==1){
            board[x][y]="*";
            return;
        }

        int size = n/3;
        int count =0;

        for(int i = x ; i < x+n ; i+=size){
            for(int j = y ; j < y+n ; j+=size) {
                count++;
                if(count==5){
                    space(i,j,size,true);
                }else{
                    space(i,j,size,false);
                }
            }
        }

    }
}
