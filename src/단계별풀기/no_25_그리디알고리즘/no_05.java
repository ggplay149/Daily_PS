package 단계별풀기.no_25_그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_05 {
    //주유소
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] distance = new long[n-1];
        for(int i = 0 ; i < n-1 ; i++ ){
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        long[] price = new long[n];
        for(int i = 0 ; i < n ; i++ ){
            price[i] = Integer.parseInt(st.nextToken());
        }

        long cost = price[0] * distance[0];
        long minPrice = price[0];

        for(int i = 1 ; i < n-1 ; i++ ){
            if(minPrice>price[i]){
                minPrice = price[i];
            }
            cost += (minPrice*distance[i]);
        }
        System.out.print(cost);
    }
}
