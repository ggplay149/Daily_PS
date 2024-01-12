package 단계별풀기.no_28_우선순위큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class no_03 {
    //절대값 힙
    public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    int c = Math.abs(o1)-Math.abs(o2);
                    if(c > 0) return 1;
                    else if(c == 0){
                        return o1-o2;
                    }
                    return -1;
                }
            });
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int i  = 0 ; i < n ; i ++ ){
                int input = Integer.parseInt(br.readLine());
                if(input == 0){
                    Integer min = pq.poll();
                    if(min == null){
                        sb.append(0).append("\n");
                    }else{
                        sb.append(min).append("\n");
                    }
                }else{
                    pq.add(input);
                }
            }
            System.out.print(sb);
        }
    }
}
