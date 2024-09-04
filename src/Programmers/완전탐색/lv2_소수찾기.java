package Programmers.완전탐색;

import java.util.HashSet;
import java.util.Set;

public class lv2_소수찾기 {

        static String[] arr;
        static Set<Integer> set;
        static boolean[] visited;

        public int solution (String numbers){

            arr = numbers.split("");
            set = new HashSet<>();
            visited = new boolean[arr.length];
            int count = 0;
            dfs("");

            for(int i : set){
                if(isPrime(i)){
                    count++;
                }
            }
            return count;

        }

        public void dfs(String comb){
            if(!comb.equals("")) set.add(Integer.parseInt(comb));
            for(int i  =0 ; i< arr.length ; i ++){
                if(!visited[i]){
                    visited[i]=true;
                    dfs(comb+arr[i]);
                    visited[i]=false;
                }
            }
        }

        public boolean isPrime(int n){
            if(n<2) return false;
            for(int i = 2 ; i <= (int)Math.sqrt(n) ; i++){
                if(n % i == 0) return false;
            }
            return true;
        }
}
