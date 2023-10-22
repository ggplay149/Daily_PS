package 단계별풀기.no_07_2차원배열;

import java.util.Scanner;

public class no_04 {
    //색종이
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] canvas = new int[100][100];
        int q = sc.nextInt();
        int count =2;
        int answer =0;

        for(int i = 0; i<q ;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int xl = x+10, yl = y+10;

            //캔버스 그리기, 겹치기 체크
            for(int a = x; a<xl ;a++){
                for(int b = y; b<yl ;b++) {
                    canvas[99-b+1][a-1]=1;
                }
            }
        }
        //캔버스 출력
        for(int z = 0; z<100 ;z++){
            for(int j = 0; j<100 ; j++){
                if(canvas[z][j]!=0)answer++;
            }
        }
        System.out.print(answer);
    }
}
