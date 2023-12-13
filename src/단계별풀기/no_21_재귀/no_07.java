package 단계별풀기.no_21_재귀;

import java.util.Scanner;

public class no_07 {
    //하노이 탑 이동 순서
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hanoi(n));
        hanoimove(n,1,2,3);
        System.out.print(sb);
    }

    private static int hanoi(int n){
        if( n == 1 ) return 1;
        return 1 + (2 * hanoi(n-1));
    }


    public static void hanoimove(int N, int start, int mid, int to) {
        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        hanoimove(N - 1, start, to, mid);
        sb.append(start + " " + to + "\n");
        hanoimove(N - 1, mid, start, to);

    }
}
