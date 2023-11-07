package 단계별풀기.no_16_스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_02 {
    //제로
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        for(int i = 0 ; i <k ; i ++){
            int input = Integer.parseInt(br.readLine());
            if(input !=0) stack.push(input);
            else stack.pop();
        }

        int sum = 0;
        for(int i : stack) sum +=i;
        System.out.print(sum);

    }
}
