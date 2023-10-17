package 단계별풀기.no_04_1차원배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no_10 {
    //평균
    public static void main(String[] args){
        while(true) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> arr = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr.add(a);
            }
            int max = Collections.max(arr);
            double sum = 0;
            for (int i = 0; i < n; i++) sum += (double) arr.get(i) / max * 100;
            System.out.print((sum / n));
        }
    }
}
