package Programmers.이분탐색;

import java.util.*;
public class lv3_입국심사 {
    public long solution(int n, int[] times) {

        Arrays.sort(times);

        long min = times[0];
        long max = times[times.length-1]*(long)n;
        long answer = 0;

        while(min<=max){
            long mid = (min+max)/2;
            long total = 0;
            for(int i = 0 ; i < times.length ; i ++){
                total += mid/times[i];
            }

            if(total<n){
                min = mid+1;
            }else{
                max = mid-1;
                answer = mid;
            }
        }
        return answer;
    }
}
