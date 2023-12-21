package 단계별풀기.no_23_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class no_03 {
    //01타일
    static List<Integer> arr = new ArrayList<>();
    static int  n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        arr.add(1);arr.add(1);
        long result = w(n);
        sb.append(result);

        System.out.print(sb);
    }
    private static int w(int n){
        if(n==1) return 1 ;
        for(int i = 2 ; i <=n ; i ++){
            arr.add((arr.get(i-1)+arr.get(i-2))%15746);
        }
        return arr.get(n);
    }
}
