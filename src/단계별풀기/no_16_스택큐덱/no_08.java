package 단계별풀기.no_16_스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class no_08 {
    //요세푸스 문제 0
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 1 ; i <= n ; i++ ){
            deque.add(i);
        }
        while(deque.size()>0){
            if(deque.size()==1) {
                sb.append(deque.pollFirst());
            }
            else {
                for (int i = 0; i < m; i++) {
                    if (i == m - 1) {
                        sb.append(deque.pollFirst()).append(", ");
                    } else {
                        deque.add(deque.pollFirst());
                    }
                }
            }
        }
        sb.append(">");
        System.out.print(sb);
    }
}
