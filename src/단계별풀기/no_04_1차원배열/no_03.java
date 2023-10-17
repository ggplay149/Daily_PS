package 단계별풀기.no_04_1차원배열;

import java.util.Scanner;

public class no_03 {
    //X보다 작은 수
    public static void main(String[] ars){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i = 0; i<n ; i++){
            num[i]=sc.nextInt();
        }

        int max =num[0], min =num[0];

        for(int i = 0; i<n ; i++){
            if(num[i]>max) max = num[i];
            if(num[i]<min) min = num[i];
        }
        System.out.print(min+" "+max);
    }
}
