package 단계별풀기.no_25_그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_04 {
    //잃어버린괄호
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stMinus = new StringTokenizer(br.readLine(), "-");
        boolean flag = false;
        int result = 0;
        while(stMinus.hasMoreTokens()){
            StringTokenizer stPlus = new StringTokenizer(stMinus.nextToken(), "+");
            int plusSum =0;
            while (stPlus.hasMoreTokens()){
                plusSum += Integer.parseInt(stPlus.nextToken());
            }
            if(!flag){
                result = plusSum;
                flag = true;
            }else{
                result -= plusSum;
            }
        }
        System.out.print(result);
    }
}
