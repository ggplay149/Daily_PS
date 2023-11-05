package 단계별풀기.no_14_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no_03 {
    //회사에 있는 사람
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String,String> map = new HashMap<>();
        StringTokenizer st;
        for(int i =0 ; i<n ; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(),st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        for(Map.Entry<String,String> elem : map.entrySet()){
            if(elem.getValue().equals("enter"))arr.add(elem.getKey());
        }
        Collections.sort(arr, Collections.reverseOrder());
        for(String i :  arr) System.out.println(i);
    }
}
