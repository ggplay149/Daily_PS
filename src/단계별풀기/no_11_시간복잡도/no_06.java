package 단계별풀기.no_11_시간복잡도;

import java.util.Scanner;

public class no_06 {
    //알고리즘 수업 - 알고리즘의 수행 시간 6
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(N*(N-1)*(N-2)/6);
        System.out.print("3");
    }
}
