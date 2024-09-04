package Programmers.완전탐색;

import java.util.ArrayList;

public class lv1_모의고사 {
    public int[] solution(int[] answers) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int aCount = 0 , bCount = 0, cCount = 0;
        int aIndex = 0 , bIndex = 0, cIndex = 0;

        for(int n : answers){

            if(n == a[aIndex]) aCount++;
            if(n == b[bIndex]) bCount++;
            if(n == c[cIndex]) cCount++;

            aIndex++; if(aIndex> a.length-1) aIndex = 0;
            bIndex++; if(bIndex> b.length-1) bIndex = 0;
            cIndex++; if(cIndex> c.length-1) cIndex = 0;

        }

        int max = Math.max(aCount,Math.max(bCount,cCount));
        ArrayList<Integer> answer = new ArrayList<>();
        if(aCount == max) answer.add(1);
        if(bCount == max) answer.add(2);
        if(cCount == max) answer.add(3);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
