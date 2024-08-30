package Programmers.array;

public class lv2_HIndex {
    class Solution {
        public int solution(int[] citations) {

            int max = Integer.MIN_VALUE;
            int answer = Integer.MIN_VALUE;

            for(int c : citations)	max = Math.max(c,max);

            for(int i = 0; i <= max ; i++){

                int overCount = 0;
                int underCount = 0;

                for( int j = 0 ; j < citations.length ; j++){
                    if( i <= citations[j] ) overCount++;
                    else underCount++;
                }

                if(overCount >= i && underCount <= i) answer = Math.max(i,answer);

            }
            return answer;
        }
    }
}
