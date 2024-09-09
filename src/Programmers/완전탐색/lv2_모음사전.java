package Programmers.완전탐색;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lv2_모음사전 {

    static List<String> arr = new ArrayList<>();
    static String[] words = {"A", "E", "I", "O", "U"};

    public static void main (String[] args) {
        dfs("");
        Collections.sort(arr);
        System.out.println(arr.indexOf("E"));
    }

    static void dfs(String comb){
        if(comb.length() > 5)return;
        if(!comb.equals(""))arr.add(comb);
        for(int i = 0 ; i < words.length ; i++){
            dfs(comb+words[i]);
        }
    }
}
