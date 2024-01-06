package 단계별풀기.no_26_분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_07 {
    static long[][] arr;
    //행렬제곱
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        arr = new long[n][n];

        for(int i = 0 ; i < n ; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        long[][] answer = divideCal(arr,m);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                sb.append(answer[i][j]).append(" ");
            }
            sb.setLength(sb.length()-1);
            sb.append("\n");
        }
        System.out.println(sb);

    }

    public static long[][] divideCal(long[][] x, long b ) {

        if(b == 1) {
            for(int i=0;i<x.length;i++) {
                for(int j=0;j<x.length;j++) {
                    x[i][j] = x[i][j] % 1000;
                }
            }
            return x;
        }

        long[][] y = divideCal(x,b/2);
        return (b%2==0)? calProduct(y,y) : calProduct(calProduct(y,y),x);
    }

    public static long[][] calProduct(long[][] m1, long[][] m2) {
        int size = m1.length;

        long temp[][] = new long[size][size];

        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                int sum = 0;
                for(int k=0;k<size;k++) {
                    sum += m1[i][k]*m2[k][j];
                }
                temp[i][j] = sum % 1000;
            }
        }

        return temp;
    }
}
