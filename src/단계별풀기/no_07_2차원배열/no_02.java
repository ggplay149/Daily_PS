package 단계별풀기.no_07_2차원배열;

import java.util.Scanner;

public class no_02 {
    //최댓값
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q[][]= new int[9][9];
        int row = 0, col = 0;
        int max = 0;
        for(int i = 0; i<9 ;i++){
            for(int j = 0; j<9 ; j++){
                q[i][j]=sc.nextInt();
                if(q[i][j]>max){
                    max = q[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((row+1)+" "+(col+1));

    }
}
