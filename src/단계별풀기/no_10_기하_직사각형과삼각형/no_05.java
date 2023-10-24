package 단계별풀기.no_10_기하_직사각형과삼각형;

import java.util.Scanner;

public class no_05 {
    //대지
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xMax=-10000,yMax=-10000,xMin=10000,yMin=10000;
        sc.nextLine();
        for(int i=0 ; i<n ; i++){
            String[] input = sc.nextLine().split(" ");
            int[] xy= {Integer.parseInt(input[0]),Integer.parseInt(input[1])};
            if(xMax<xy[0])xMax=xy[0];
            if(yMax<xy[1])yMax=xy[1];
            if(xMin>xy[0])xMin=xy[0];
            if(yMin>xy[1])yMin=xy[1];
        }
        if(n==1) System.out.print(0);
        else if(xMax-xMin==0 || yMax-yMin==0) System.out.print(0);
        else System.out.print((xMax-xMin)*(yMax-yMin));
    }
}
