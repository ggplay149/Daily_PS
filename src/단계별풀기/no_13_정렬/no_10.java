package 단계별풀기.no_13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class no_10 {
    //나이순 정렬
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        String[][] arr = new String[n][3];
        for(int i = 0 ; i< n ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = String.valueOf(i);
        }

        Arrays.sort(arr,new Comparator<String[]>(){
            @Override
            public int compare (String[] e1, String[] e2){
                if(e1[0] == e2[0]) return Integer.parseInt(e1[2])-Integer.parseInt(e2[2]);
                else return Integer.parseInt(e1[0])-Integer.parseInt(e2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< n ; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.print(sb);
    }
}
