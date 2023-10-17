package 단계별풀기.no_04_1차원배열;

import java.util.Scanner;

public class no_04 {
    //최댓값
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];
        for (int i = 0; i < 9; i++) {
            num[i] = sc.nextInt();
        }

        int max = num[0], idx = 1;

        for (int i = 0; i < 9; i++) {
            if (num[i] > max) {
                max = num[i];
                idx = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }

}
