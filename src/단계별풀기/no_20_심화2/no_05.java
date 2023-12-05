package 단계별풀기.no_20_심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class no_05 {
    //영단어 암기는 괴로워
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //선언부
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<String> input = new ArrayList<>();

        //길이 m이상 단어만 넣기
        for(int i = 0 ; i < n ; i ++){
            String inputWord = br.readLine();
            if(inputWord.length()>=m) input.add(inputWord);
        }

        //알파벳순 sort
        Collections.sort(input);


    }
}

