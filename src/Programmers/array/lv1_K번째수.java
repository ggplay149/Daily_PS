package Programmers.array;

import java.util.Arrays;

public class lv1_K번째수 {

    class Solution {
        public int[] solution(int[] array, int[][] commands) {

            int[] answer = new int[commands.length];

            for (int i = 0; i < commands.length; i++) {

                int from = commands[i][0] - 1;
                int to = commands[i][1];
                int idx = commands[i][2] - 1;

                answer[i] = Arrays.stream(array)
                        .skip(from)
                        .limit(to - from)
                        .sorted()
                        .toArray()[idx];

            }
            return answer;
        }
    }
}