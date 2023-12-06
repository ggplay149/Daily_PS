package 단계별풀기.no_20_심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no_05 {
    //영단어 암기는 괴로워
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //선언부
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = 1;
        HashMap<String,Integer> map = new HashMap<>();


        //길이 m이상 단어만 넣기
        for(int i = 0 ; i < n ; i ++){
            String inputWord = br.readLine();
            if(inputWord.length()>=m) {
                map.put(inputWord,map.getOrDefault(inputWord,0)+1);
            }
        }

        List<String> arr = new ArrayList<>(map.keySet());


        //정렬
        Collections.sort(arr, new Comparator<String>(){

            @Override
            public int compare(String a, String b){
                //빈도수 비교
                if(Integer.compare(map.get(a),map.get(b))!=0){
                    return Integer.compare(map.get(b),map.get(a));
                }
                //길이비교
                if(a.length()!=b.length()){
                    return b.length()-a.length();
                }
                //사전순
                return a.compareTo(b);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str + "\n");
        }
        System.out.println(sb);
    }
}

