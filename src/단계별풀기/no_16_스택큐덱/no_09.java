package 단계별풀기.no_16_스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class no_09 {
    //덱 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<String> deque = new ArrayDeque();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n ; i++ ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            String m = "";
            switch(input){
                case"1" :
                    deque.addFirst(st.nextToken());
                    break;
                case"2" :
                    deque.addLast(st.nextToken());
                    break;
                case"3" :
                    m = deque.pollFirst();
                    if(m==null) sb.append("-1\n");
                    else sb.append(m+"\n");
                    break;
                case"4" :
                    m = deque.pollLast();
                    if(m==null) sb.append("-1\n");
                    else sb.append(m+"\n");
                    break;
                case"5" :
                    sb.append(deque.size()+"\n");
                    break;
                case"6" :
                    if(deque.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case"7" :
                    m = deque.peekFirst();
                    if(m==null) sb.append("-1\n");
                    else sb.append(m+"\n");
                    break;
                case"8" :
                    m = deque.peekLast();
                    if(m==null) sb.append("-1\n");
                    else sb.append(m+"\n");
                    break;
            }

        }
        System.out.print(sb);
    }
}
