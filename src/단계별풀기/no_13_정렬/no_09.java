package 단계별풀기.no_13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class no_09 {
    //단어 정렬
    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = "".split("\n");

        String[] arr = new String[n];
        for(int i=0;i<n;i++) arr[i] = br.readLine();
        br.close();
        arr =  Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String e1, String e2){
                if(e1.length()==e2.length()) return e1.compareTo(e2);
                else return e1.length()-e2.length();
            }
        });

        for(String i : arr) System.out.println(i);
    }
}
