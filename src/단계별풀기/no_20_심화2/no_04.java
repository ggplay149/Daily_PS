package 단계별풀기.no_20_심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class no_04 {
    //통계학
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()) , sum =0, count=1, max=0, freqNum=0;
        int[] arrInt = new int[n];

        List<Integer> arrFreq = new ArrayList<>();

        for(int i = 0 ; i < n ; i ++ ){
            String input = br.readLine();
            arrInt[i] = Integer.parseInt(input);
            sum += Integer.parseInt(input);
        }

        Arrays.sort(arrInt);
        if(n==1){
            sb.append(arrInt[0]+"\n")
                    .append(arrInt[0]+"\n")
                    .append(arrInt[0]+"\n")
                    .append(0);
        }else{
            for(int i = 0 ; i < n-1 ; i ++ ){
                if(arrInt[i]== arrInt[i+1]){
                    count++;
                }
                if(arrInt[i]!= arrInt[i+1] || i == n-2){
                    if(count>max){
                        arrFreq = new ArrayList<>();
                        arrFreq.add(arrInt[i]);
                        max = count;
                    }else if(count==max){
                        arrFreq.add(arrInt[i]);
                    }
                    count = 1;
                }
            }

            Collections.sort(arrFreq);
            if(arrFreq.size()==1){freqNum = arrFreq.get(0);}
            else{freqNum = arrFreq.get(1);}

            float avg = (float) sum/n;
            sb.append(Math.round(avg)+"\n")
                    .append(arrInt[(n/2)]+"\n")
                    .append(freqNum+"\n")
                    .append(arrInt[n-1]-arrInt[0]);
        }
        System.out.print(sb);
    }
}
