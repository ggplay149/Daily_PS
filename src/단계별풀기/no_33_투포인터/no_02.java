package 단계별풀기.no_33_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_02 {
    //두용액
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int start = 0, end = n - 1;
        long min = Math.abs(arr[start] + arr[end]);
        int[] result = new int[2];
        result[0] = start;
        result[1] = end;

        while (start < end) {
            long sum = 0;
            if (Math.abs(arr[start + 1] + arr[end]) < Math.abs(arr[start] + arr[end - 1])) {
                sum = Math.abs(arr[start + 1] + arr[end]);
                if (sum < min) {
                    min = sum;
                    result[0] = start + 1;
                    result[1] = end;
                }
                start++;
            } else if (Math.abs(arr[start + 1] + arr[end]) > Math.abs(arr[start] + arr[end - 1])) {
                sum = Math.abs(arr[start] + arr[end - 1]);
                if (sum < min) {
                    min = sum;
                    result[0] = start;
                    result[1] = end - 1;
                }
                end--;
            }
        }

        System.out.print(arr[result[0]] + " " + arr[result[1]]);
    }

}
