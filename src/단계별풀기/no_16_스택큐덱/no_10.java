package 단계별풀기.no_16_스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class no_10 {
    // 풍선 터뜨리기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<int[]> deque = new ArrayDeque();

        //값과 인덱스 넣기
        for(int i = 1 ; i <= n ; i ++){
            deque.add(new int[]{i,Integer.parseInt(st.nextToken())});
        }

        //첫번째 수 판별
        String flag = "";
        int[] first = deque.pollFirst();
        sb.append(first[0] + " ");
        if(first[1]>0){
            for(int i = 0 ; i < first[1]-1; i ++){
                deque.add(deque.pollFirst());
            }
            flag="+";
        }
        else if(first[1]<0){
            for(int i = 0 ; i < Math.abs(first[1])-1; i ++){
                deque.addFirst(deque.pollLast());
            }
            flag="-";
        }

        while(deque.size()>0){

            int[] m = new int[2];

            if(flag.equals("+")) m = deque.pollFirst();
            else if (flag.equals("-")) m = deque.pollLast();

            int idx = m[0];
            int num = m[1];
            sb.append(idx + " ");
            if(num > 0 && deque.size()!= 0){
                for(int i = 0 ; i < num-1; i ++){
                    deque.add(deque.pollFirst());
                }
                flag = "+";
            }else if(num < 0 && deque.size()!= 0){
                for(int i = 0 ; i < Math.abs(num)-1; i ++){
                    deque.addFirst(deque.pollLast());
                }
                flag = "-";
            }
        }
        System.out.print(sb);
    }
}
