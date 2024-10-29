package book.chap2_array;
public class 삼각달팽이 {

    private static int[] dx = {0,1,-1};
    private static int[] dy = {1,0,-1};

    public static void main (String[] args){

        int n = 5;
        int[][] board = new int[n][n];

        int count = 1;
        int x = 0 , y = 0 ,d = 0;


        while(true){

            board[y][x] = count++;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx == n || ny == n || nx == -1 || ny == -1 || board[ny][nx] != 0){
                d = (d+1)%3;
                nx = x+dx[d];
                ny = y+dy[d];
                if(nx == n || ny == n || nx == -1 || ny == -1 || board[ny][nx] != 0) break;
            }
            x = nx;
            y = ny;
        }

        int[] result = new int[count-1];
        int index = 0;

        for(int i = 0 ;  i < n ; i ++){
            for(int j = 0 ;  j <= i ; j ++){
                result[index++] = board[i][j];
            }
        }
    }
}
