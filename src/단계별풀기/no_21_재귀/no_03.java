package 단계별풀기.no_21_재귀;

import java.io.*;
import java.util.*;
public class no_03{

    static int[] tmp;

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken());

        tmp = new int[n];

        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i]= Integer.parseInt(st.nextToken());
        }

        merge_sort(a,0,a.length-1);
        for(int num : a) System.out.print(num + " ");

    }

    public static void merge_sort(int[] a,int low,int high){
        if(low<high){
            int mid = (low + high) / 2;
            merge_sort(a, low, mid);
            merge_sort(a, high + 1, mid);
            merge(a, low, mid, high);
        }
    }
    public static void merge(int[] a,int low, int mid, int high){

        int i = low, j = mid+1, t = 0;

        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) tmp[t++] = a[i++];
			else tmp[t++] = a[j++];
        }
        while (i <= mid) tmp[t++] = a[i++];
        while (j <= high) tmp[t++] = a[j++];
         i = low; t = 0;
        while (i <= high) a[i++] = tmp[t++];
    }
}