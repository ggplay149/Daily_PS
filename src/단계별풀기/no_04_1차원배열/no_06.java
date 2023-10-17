package 단계별풀기.no_04_1차원배열;

import java.util.ArrayList;
import java.util.Scanner;

public class no_06 {
    //공바꾸기
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();



        int[] a= new int[n];
        for( int x = 0; x < n; x++) a[x] = x+1;
        for( int x = 0; x < m; x++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = 0;
            temp = a[j-1];
            a[j-1] = a[i-1];
            a[i-1] = temp;
        }
        for( int x = 0; x < n; x++) System.out.print(a[x]+" ");
    }
}
