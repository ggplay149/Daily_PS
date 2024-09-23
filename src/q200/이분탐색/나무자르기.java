package q200.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 나무자르기 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int required = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");
        ArrayList<Integer> treeLengths = new ArrayList<>();
        br.close();

        int maxLength = Integer.MIN_VALUE;
        for(String l : input) {
            treeLengths.add(Integer.parseInt(l));
            if(Integer.parseInt(l)>maxLength) maxLength = Integer.parseInt(l);
        }

        int length = 0, high = maxLength , low = 0, answer = 0;

        while(low<=high){
            long sum = 0;
            length = (high+low)/2;
            for(int tree : treeLengths) if(tree>length) sum += tree-length;
            if(sum >= required){
                answer = length;
                low = length+1;
            }
            else high = length-1;
        }
        System.out.println(answer);
    }
}