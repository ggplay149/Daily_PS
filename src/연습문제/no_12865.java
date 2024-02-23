package 연습문제;
import java.io.*;
import java.util.*;

public class no_12865{
    //평범한 배낭
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int stuffNums =  Integer.parseInt(st.nextToken());
        int maxWeigth =  Integer.parseInt(st.nextToken());

        stuff[] stuffList = new stuff[stuffNums+1];
        long[][] dp = new long[stuffNums+1][maxWeigth+1];

        for(int i =1 ; i <= stuffNums ; i ++){
            st = new StringTokenizer(br.readLine());
            int tempWeight =  Integer.parseInt(st.nextToken());
            int tempWealth =  Integer.parseInt(st.nextToken());
            stuffList[i] = new stuff(tempWeight,tempWealth);
        }
        //i : 물건
        //j : 무게
        for(int i =1 ; i <= stuffNums ; i ++){
            for(int j =1 ; j <= maxWeigth ; j ++){
                //예상 무게보다 i번째 물건의 무게 낮아 담을수 있다면
                if(j>=stuffList[i].weight){
                    //
                    dp[i][j] = Math.max(dp[i-1][j]
                            ,dp[i-1][j-stuffList[i].weight]+stuffList[i].wealth);
                }
                //예상 무게보다 i번째 물건의 무게 높아 담을수 없다면
                else{
                    //i-1번째까지 최대합이 현재 최고 최대합
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.print(dp[stuffNums][maxWeigth]);

    }
}

class stuff{
    int weight, wealth;
    public  stuff(int weight, int wealth){
        this.wealth = wealth;
        this.weight = weight;
    }
}

