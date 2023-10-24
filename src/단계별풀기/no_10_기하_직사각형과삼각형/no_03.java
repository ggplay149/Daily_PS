package 단계별풀기.no_10_기하_직사각형과삼각형;

import java.util.Scanner;

public class no_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        for(int i = 0; i<3 ; i++){
            String[] input = sc.nextLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }
        for(int i = 0; i<3 ; i++){

            int count =0, count2 = 0;

            for(int j = 0; j<3 ; j++) if(arr[i][0]==arr[j][0]) count++;
            if(count!=2) arr[3][0] = arr[i][0];

            for(int j = 0; j<3 ; j++)if(arr[i][1]==arr[j][1]) count2++;
            if(count2!=2)arr[3][1] = arr[i][1];

        }
        System.out.print(arr[3][0]+" "+arr[3][1]);
    }
}
