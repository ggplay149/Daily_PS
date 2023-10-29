package 단계별풀기.no_13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_02 {
    //대표값2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0 ; i< 5 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0 ; i< 5 ; i++){
            for(int j = 0 ; j<5-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr) sum+=i;
        System.out.println(sum/5);
        System.out.print(arr[2]);
    }
}
