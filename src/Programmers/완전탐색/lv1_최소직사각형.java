package Programmers.완전탐색;

public class lv1_최소직사각형 {
    class Solution {
        public int solution(int[][] sizes) {

            int wMax = Integer.MIN_VALUE;
            int hMax = Integer.MIN_VALUE;

            for(int[] s : sizes){

                int wTemp = Math.max(s[0],s[1]);
                int hTemp = Math.min(s[0],s[1]);

                wMax = Math.max(wMax,wTemp);
                hMax = Math.max(hMax,hTemp);
            }

            return wMax*hMax;
        }
    }
}
