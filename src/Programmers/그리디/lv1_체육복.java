package Programmers.그리디;
import java.util.Arrays;

public class lv1_체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 1);
        for (int i : reserve) arr[i]++;
        for (int i : lost) arr[i]--;

        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                if (i - 1 > 0 && arr[i - 1] == 2) {
                    arr[i]++;
                    arr[i - 1]--;
                }
                else if (i + 1 <= n && arr[i + 1] == 2) {
                    arr[i]++;
                    arr[i + 1]--;
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] > 0) count++;
        }
        return count;
    }
}

