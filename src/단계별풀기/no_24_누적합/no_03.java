package 단계별풀기.no_24_누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class no_03 {
    //인간-컴퓨터 상호작용
     public static void main (String[] args)throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();
         String s = br.readLine();

         int[][] sum = new int[s.length()][26];
         // 1번째 초기화
         sum[0][s.charAt(0) - 'a']++;

         // 1~끝까지 누적합 구하기
         for(int i = 1; i < s.length(); i++) {
             int tmp = s.charAt(i) - 'a';
             for(int j = 0; j < 26; j++) {
                 sum[i][j] = sum[i - 1][j];
             }
             sum[i][tmp]++;
         }

         int q = Integer.parseInt(br.readLine());

         StringTokenizer st;
         for(int i = 0 ; i <  q ; i ++){
             st = new StringTokenizer(br.readLine());
             char key = st.nextToken().charAt(0);
             int l = Integer.parseInt(st.nextToken());
             int r = Integer.parseInt(st.nextToken());

             if(l==0){
                 sb.append(sum[r][key - 'a']).append('\n');
             }else {
                 sb.append(sum[r][key - 'a'] - sum[l - 1][key - 'a']).append('\n');
             }
         }
         System.out.print(sb);
     }
}

