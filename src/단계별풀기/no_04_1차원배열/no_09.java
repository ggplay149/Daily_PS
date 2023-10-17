package 단계별풀기.no_04_1차원배열;

import java.util.Scanner;

public class no_09 {
    //바구니 뒤집기
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp = 0;

        int[] a= new int[n];

        for( int x = 0; x < n; x++) a[x] = x+1;

        for(int x = 0; x < m; x++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int[] r = new int[j-i+1];

            for(int y = j-1,z=0; y >= i-1 ; y--,z++)r[z] = a[y];
            for(int k = i-1,y=0; k < j; k++,y++) a[k] = r[y];

        }
        for( int x = 0; x < n; x++) System.out.print(a[x]+" ");
    }
}
