package 단계별풀기.no_14_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class no_07 {
    //대칭 차집합
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> arr1 = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i ++ ) arr1.add(Integer.parseInt(st.nextToken()));

        Set<Integer> arr2 = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i ++ ) arr2.add(Integer.parseInt(st.nextToken()));

        int count = 0;
        for(int i : arr1) {
            if(!arr2.contains(i)) count++;
        }
        for(int i : arr2) {
            if(!arr1.contains(i)) count++;
        }
        System.out.print(count);
    }
}
