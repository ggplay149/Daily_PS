package 단계별풀기.no_07_2차원배열;

import java.util.Scanner;

public class no_03 {
    //세로읽기
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][15];
        for(int i = 0; i<5 ;i++){
            String[] line = sc.next().split("");
            for(int j = 0 ; j< line.length;j++){
                arr[i][j] = line[j];
            }
            if(i == 4){
                for(int x= 0; x<15;x++){
                    for(int y =0;y<5;y++){
                        if(arr[y][x]!=null)
                            System.out.print(arr[y][x]);
                    }
                }
            }
        }
    }

}
