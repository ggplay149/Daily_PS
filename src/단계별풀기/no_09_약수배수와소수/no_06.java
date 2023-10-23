package 단계별풀기.no_09_약수배수와소수;

import java.util.ArrayList;
import java.util.Scanner;

public class no_06 {
    // 소인수 분해
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();

        int a = sc.nextInt();
        int idx = 0;
        if (a != 1) {
            for (int i = 1; i <= a; i++) if (a % i == 0) arr.add(i);
            for (int i : arr) {
                int count = 0;
                for (int j = 1; j <= i; j++) if (i % j == 0) count++;
                if (count == 2) num.add(i);
            }

            while (true) {
                if (a % num.get(idx) == 0) {
                    System.out.println(num.get(idx));
                    if (a / num.get(idx) == 1) break;
                    a /= num.get(idx);
                } else idx++;
            }
        }
    }
}
