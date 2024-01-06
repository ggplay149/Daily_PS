package 단계별풀기.no_27_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_01 {
    //수찾기
    static int[] arr1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr1 = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for(int i = 0 ; i < m ; i ++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < m ; i ++){
            sb.append(search(arr2[i],0,n-1) + "\n");
        }
        System.out.print(sb);

    }

    public static int search(int key, int low, int high){
        int mid;
        int value;
        if(low<=high){
            mid = (low+high)/2;
            value = arr1[mid];

            if(value == key) return 1;
            else if(value>key) return search(key,low,mid-1);
            else if(value<key) return search(key,mid+1,high);
        }
        return 0;
    }
}
