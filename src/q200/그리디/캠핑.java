package q200.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 캠핑 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count =0;
        while(true){
            count++;
            String input = br.readLine();
            if(input.equals("0 0 0")) break;
            String[] dayData = input.split(" ");
            int     days = Integer.parseInt(dayData[0])
                    , maxDays = Integer.parseInt(dayData[1])
                    , totalDays  = Integer.parseInt(dayData[2]);
            System.out.println("Case "+count+": "+((totalDays/maxDays*days) + Math.min((totalDays%maxDays),days)));
        }
    }
}