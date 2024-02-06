package 단계별풀기.no_33_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_01 {
    //두수의 합
    public static void main (String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        long[] arr = new long[length];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < length ; i ++ ){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int target = Integer.parseInt(br.readLine());
        if(length < 2) System.out.print(0);
        else {
            int start = 0, end = length - 1, count = 0;

            while (start < end) {
                long sum = arr[start] + arr[end];
                if (sum == target) {
                    System.out.println("start = " + start);
                    System.out.println("end = " + end);
                    count++;
                    if (arr[start] == arr[end]) {
                        end--;
                    }
                    start++;
                } else if (sum > target) end--;
                else start++;
            }
            System.out.print(count);
        }
    }
}
