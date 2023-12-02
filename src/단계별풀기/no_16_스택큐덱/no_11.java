package 단계별풀기.no_16_스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class no_11 {
    //queuestack
    public static void main(String[] args) throws IOException {

        //초기 선언부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] arr = new String[n];

        //큐덱 구분
        for(int i = 0 ; i < n ; i ++ ) arr[i]=st.nextToken();

        //기본값
        Deque<String> deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i ++ ) {
            String t = st.nextToken();
            if(arr[i].equals("0")) {
                deque.add(t);
            }
        }

        //원소입력갯수
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        //원소입력
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i ++ ) {
            deque.addFirst(st.nextToken());
            sb.append(deque.pollLast()).append(" ");
        }
        //출력
        System.out.print(sb);
    }
}
