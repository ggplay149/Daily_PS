package book.chap2_array;
public class 거리두기확인하기 {

    private static int[] dx = {1,0,-1,0};
    private static int[] dy = {0,1,0,-1};
    private static char[][] board = new char[5][5];

    public static void main(String[] args){

        String[] input = {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"};

        for(int i = 0 ; i < 5 ; i ++) {
            for(int j = 0 ; j < 5 ; j ++) {
                board[i][j] = input[i].charAt(j);
            }
        }

        for(int i = 0 ; i < 5 ; i ++) {
            for(int j = 0 ; j < 5 ; j ++) {

                if(board[i][j]!='P') continue;

                for(int d = 0 ; d <4 ; d ++){

                    int nx = j+dx[d];
                    int ny = i+dy[d];

                    if(nx == 5 || ny == 5 || nx == -1 || ny == -1) continue;

                    switch (board[ny][nx]){
                        case 'O' :
                            break;
                        case 'X' :
                            break;
                        case 'P' :
                            System.out.println("실패");
                            break;
                    }


                }

            }
        }


        for(int i = 0 ; i < 5 ; i ++) {
            for(int j = 0 ; j < 5 ; j ++) {
               System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }


    private static boolean checkDistanced(int x, int y){

        for(int i = 0 ; i <4 ; i ++){

            int nx = x+dx[i];
            int ny = y+dy[i];

            if(board[ny][nx]=='P') return false;
        }

        return true;
    }
}
