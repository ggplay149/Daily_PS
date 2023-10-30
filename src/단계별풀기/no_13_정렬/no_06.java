package 단계별풀기.no_13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_06 {
    //소트인사이드
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = new String[n];
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        for(int i = 0 ; i <n ;i++){
            input[i] = br.readLine();
            String[] temp = input[i].split(" ");
            a[i] = Integer.parseInt(temp[0]);
            b[i] = Integer.parseInt(temp[1]);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0 ; i <n;i++) System.out.println(a[i] + " " + b[i]);
    }
}
