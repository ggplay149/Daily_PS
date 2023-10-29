package 단계별풀기.no_13_정렬;

import java.io.IOException;
import java.util.Scanner;

public class no_03 {
    //커트라인
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String[] nums = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = Integer.parseInt(nums[i]);
        }
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j<n-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print(arr[k-1]);
    }
}
