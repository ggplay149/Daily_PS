package q200.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//2578
public class 빙고 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] board = new String[5][5];

        //board에 담기
        for (int i = 0; i < 5; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) board[i][j] = input[j];
        }

        //콜넘버 담기
        Queue<String> callNumbers = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) callNumbers.add(input[j]);
        }

        br.close();

        //번호 부르기 카운트
        int callCount = 0;

        bingGo:
        while(callCount<=25) {
            int bingGoCount = 0;
            //번호 부르기
            String number = callNumbers.poll();
            callCount++;

            //해당 번호 체크
            check:
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (board[i][j].equals(number)) {
                        board[i][j] = "check";
                        break check;
                    }
                }
            }

            //가로 빙고 체크
            for (int i = 0; i < 5; i++) {
                int count = 0;
                for (int j = 0; j < 5; j++) if (board[i][j].equals("check")) count++;
                if (count == 5) bingGoCount++;
                if (bingGoCount >= 3) break bingGo;
            }


            //세로 빙고 체크
            for (int i = 0; i < 5; i++) {
                int count = 0;
                for (int j = 0; j < 5; j++) if (board[j][i].equals("check")) count++;
                if (count == 5) bingGoCount++;
                if (bingGoCount >= 3) break bingGo;
            }


            //우하향 대각선 빙고 체크
            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (board[i][i].equals("check")) count++;
                if (count == 5) bingGoCount++;
                if (bingGoCount >= 3) break bingGo;
            }

            //우상향 대각선 빙고 체크
            count = 0;
            for (int i = 0; i < 5; i++) {
                if (board[4 - i][i].equals("check")) count++;
                if (count == 5) bingGoCount++;
                if (bingGoCount >= 3) break bingGo;
            }
        }
        System.out.println(callCount);
    }
}
