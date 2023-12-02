package 단계별풀기.no_16_스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no_05 {
    //도키도키 간식드리미
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        Queue<Integer> test = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < n ; i ++){
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int count = 1;

        while(true){
            int qp =0;
            if(queue.size()!=0)  qp = queue.poll();

            if(qp!=count){
                if(stack.empty()==false){
                    if(stack.peek()==count){
                        count++;
                        test.add(stack.pop());
                        queue.addFirst(qp);
                    }else if(stack.peek()!=count ){
                        if(stack.peek()<qp){
                            System.out.print("Sad");
                            break;
                        }else if(stack.peek()>qp){
                            stack.push(qp);
                        }
                    }
                }else if(stack.empty()==true){
                    stack.push(qp);
                }
            }else if(qp ==count){
                count++;
                test.add(qp);
            }

//            System.out.println("========================");
//            System.out.println(">>>>>Queue : " +queue);
//            System.out.println(">>>>>Stack : "+stack);
//            System.out.println(">>>>>Test : "+test);
//            System.out.println("========================\n");

            if(count == n)  {
                System.out.print("Nice");
                break;
            }

        }
    }
}
