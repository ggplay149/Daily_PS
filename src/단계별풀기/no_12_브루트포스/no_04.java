package 단계별풀기.no_12_브루트포스;
import java.util.*;

public class no_04 {
    //체스판 다시 칠하기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]);
        int min = 64;
        String[][] a = new String[n][m];

        //기존 체스판 입력
        for (int x = 0; x < n; x++) {
            String[] inputLine = sc.next().split("");
            for (int y = 0; y < m; y++)  a[x][y] = inputLine[y];
        }

        //한칸씩이동하며 8x8탐색
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {

                //B가 먼저올때 count 최소값
                int count = 0;
                for (int x = i; x < 8 + i; x++) {
                    for (int y = j; y < 8 + j; y++) {
                        if ((x % 2 == 0 && y % 2 == 0) || (x % 2 == 1 && y % 2 == 1)) {
                            if (!a[x][y].equals("B")) count++;
                        } else {
                            if (!a[x][y].equals("W")) count++;
                        }
                    }
                }
                if (min > count) min = count;

                //W가 먼저올때 count 최소값
                count = 0;
                for (int x = i; x < 8 + i; x++) {
                    for (int y = j; y < 8 + j; y++) {
                        if ((x % 2 == 0 && y % 2 == 0) || (x % 2 == 1 && y % 2 == 1)) {
                            if (!a[x][y].equals("W")) count++;
                        } else {
                            if (!a[x][y].equals("B")) count++;
                        }
                    }
                }
                if (min > count) min = count;
            }
        }
        //정답출력
        System.out.print(min);
    }
}

