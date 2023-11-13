package 단계별풀기.no_16_스택큐덱;

import java.io.*;
import java.util.*;

public class no_04{
    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {

            String[] input = br.readLine().split("");
            if (input[0].equals(".")) break;
            Stack<String> stack = new Stack<>();

            for(String i : input) {
                if(i.equals(".")){
                    if(stack.size()>0){
                            System.out.println("no");
                    }
                    else System.out.println("yes");
                    break;
                }
                else if(i.equals("[") || i.equals("(")){
                    stack.push(i);
                }else if(i.equals("]") || i.equals(")")){
                    if(stack.size()>0) {
                        if (i.equals("]")
                                && stack.peek().equals("[")) stack.pop();
                        else if (i.equals(")")
                                && stack.peek().equals("(")) stack.pop();
                        else {
                            System.out.println("no");
                            break;
                        }
                    }else{
                        System.out.println("no");
                        break;
                    }
                }
            }
        }
    }
}