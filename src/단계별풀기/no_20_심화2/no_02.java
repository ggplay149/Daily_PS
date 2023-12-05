package 단계별풀기.no_20_심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class no_02 {
    //인사성 밝은 곰곰이
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        HashSet<String> set = new HashSet<>();

        for(int i = 0 ; i < n ; i ++){
            String input = br.readLine();
            if(input.equals("ENTER")){
                count += set.size();
                set.clear();
            }else{
                set.add(input);
            }

            if(i==(n-1)) count += set.size();
        }
        System.out.print(count);
    }
}
