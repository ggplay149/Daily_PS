package book.chap2_array;
public class 거리두기확인하기 {

    private static int[] dx = {1,0,-1,0};
    private static int[] dy = {0,1,0,-1};
    private static char[][] board = new char[5][5];
    private static int[] answer;

    public int[] solution(String[][] places) {

        answer = new int[places.length];

        n: for (int n = 0; n < places.length; n++) {

            String[] words = places[n];

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    board[i][j] = words[i].charAt(j);
                }
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {

                    if (board[i][j] != 'P') continue;

                    for (int d = 0; d < 4; d++) {

                        int nx = j + dx[d];
                        int ny = i + dy[d];

                        if (nx == 5 || ny == 5 || nx == -1 || ny == -1) continue;

                        switch (board[ny][nx]) {
                            case 'O':
                                if (!checkDistanced(nx,ny,i,j)) {
                                    answer[n] = 0;
                                    continue n;
                                }
                                break;
                            case 'X':
                                break;
                            case 'P':
                                answer[n] = 0;
                                continue n;
                        }
                    }
                }
                answer[n] = 1;
            }
        }
        return answer;
    }
    private static boolean checkDistanced ( int x, int y, int fromY, int fromX){

        for (int i = 0; i < 4; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx == 5 || ny == 5 || nx == -1 || ny == -1) continue;
            if(fromY == ny && fromX == nx) continue;

            if (board[ny][nx] == 'P') {
                return false;
            }
        }

        return true;
    }
}
