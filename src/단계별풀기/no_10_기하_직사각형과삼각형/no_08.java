package 단계별풀기.no_10_기하_직사각형과삼각형;

import java.util.Arrays;
import java.util.Scanner;

public class no_08 {
    //세 막대
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < 3; i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        int answer = 0;
        if(a[0]==a[1] && a[1]==a[2]) answer=a[0]*3;
        else if(a[0]+a[1]<=a[2])answer = a[0]+a[1]+(a[0]+a[1]-1);
        else answer=a[0]+a[1]+a[2];
        System.out.print(answer);
    }

}
