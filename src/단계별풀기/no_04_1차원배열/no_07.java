package 단계별풀기.no_04_1차원배열;

import java.util.Scanner;

public class no_07 {
    //과제 안내신분..?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[28];
        int flag = 0;

        for (int x = 0; x < 28; x++) {
            a[x] = sc.nextInt();
        }
        for (int x = 1; x <= 30; x++) {
            flag = 0;
            for (int y = 0; y < 28; y++) {
                if (a[y] == x) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println(x);

        }

    }
}

