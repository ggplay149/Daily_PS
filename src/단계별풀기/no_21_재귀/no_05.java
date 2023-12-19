package 단계별풀기.no_21_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_05 {
    //칸토어 집합
    static StringBuilder sb;

    static String[] arr;

    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null) {
            sb = new StringBuilder();
            int m = (int) Math.pow(3, Integer.parseInt(str));
            arr = new String[m];
            for (int j = 0; j < m; j++) {
                arr[j] = "-";
            }
            draw(0,m);
            for (String answer : arr) {
                sb.append(answer);
            }
            sb.append("\n");
            System.out.print(sb);

        }
    }
    public static void draw(int start, int size) {
        if (size == 1) {
                return;
        }
        int plus = size/3;
        for (int i = start+plus; i < start+2*plus; i++) {
            arr[i] = " ";
        }
        draw(start,plus);
        draw(start+2*plus,plus);
    }
}
