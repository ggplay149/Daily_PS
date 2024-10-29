package book.chap2_array;

import java.util.ArrayList;
import java.util.Arrays;

public class 교점에별만들기 {
    public static void main (String[] args) {

        int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};

        ArrayList<Point> pointList = new ArrayList<>();
        long maxX = Integer.MIN_VALUE,maxY= Integer.MIN_VALUE,minX = Integer.MAX_VALUE,minY = Integer.MAX_VALUE;

        for(int i = 0 ; i < line.length ; i ++){
            for(int j = i+1 ; j < line.length ; j++){
                Point point = findIntersection(
                        line[i][0],line[i][1],line[i][2],
                        line[j][0],line[j][1],line[j][2]
                        );
                if(point != null) {
                    if(point.x > maxX) maxX = point.x;
                    if(point.y > maxY) maxY = point.y;
                    if(point.x < minX) minX = point.x;
                    if(point.y < minY) minY = point.y;
                    pointList.add(point);
                }
            }
        }

        char[][] board = new char[(int)(maxY-minY+1)][(int)(maxX-minX+1)];
        for(char[] row : board) Arrays.fill(row,'.');

        for(Point point : pointList) board[(int)(maxY-point.y)][(int)(point.x-minX)] = '*';

        String[] answer = new String[board.length];
        for(int i = 0 ; i <  answer.length ; i ++) answer[i] = new String(board[i]);

        for(int i = 0 ; i < board.length ; i ++){
            for(int j = 0 ; j < board.length ; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        System.out.println(); System.out.println();


        for(int i = 0 ; i < answer.length ; i ++){
            System.out.println(answer[i]);
        }



    }

    private static class Point{
        public final long x,y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    private static Point findIntersection(long a, long b, long e, long c, long d, long f) {
        if ((a * d) - (b * c) == 0) return null;

        double x = (double)((b * f) - (e * d)) / ((a * d) - (b * c));
        double y = (double)((e * c) - (a * f)) / ((a * d) - (b * c));

        if (x % 1 != 0 || y % 1 != 0) return null;

        return new Point((long)x, (long)y);
    }
}


