package 알고리즘다시준비.chp01_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        br.close();

        int yCount = 0;
        int mCount = 0;

        for(int i = 0 ; i < num ; i ++){

            int usedTime = Integer.parseInt(arr[i]);

            yCount += (usedTime/30+1)*10;
            mCount += (usedTime/60+1)*15;

        }


        String answer = "";
        if(yCount<mCount) answer = "Y "+yCount;
        else if(yCount>mCount) answer = "M "+mCount;
        else answer="Y M "+yCount;

        System.out.print(answer);
    }
}
