package 단계별풀기.no_28_우선순위큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class no_01 {
    //최대힙
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i  = 0 ; i < n ; i ++ ){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                Integer max = pq.poll();
                if(max == null){
                    sb.append(0).append("\n");
                }else{
                    sb.append(max).append("\n");
                }
            }else{
                pq.add(input);
            }
        }
        System.out.print(sb);
    }
}
