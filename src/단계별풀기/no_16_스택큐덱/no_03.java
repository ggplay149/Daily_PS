package 단계별풀기.no_16_스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_03 {
    //괄호
    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        for(int i = 0 ; i <k ; i ++){
            String[] input = br.readLine().split("");
            stack.clear();
            try {
                for(int j = 0 ; j <input.length ; j ++){
                    if(input[j].equals("(")) stack.push("(");
                    else if(input[j].equals(")")) stack.pop();

                    if(j == input.length-1 &&stack.isEmpty()) System.out.println("YES");
                    else if((j == input.length-1 &&!stack.isEmpty())) System.out.println("NO");
                }
            }catch (Exception e){
                System.out.println("NO");
            }
        }
    }
}
