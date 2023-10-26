package 단계별풀기.no_12_브루트포스;

import java.util.ArrayList;
import java.util.Scanner;

public class no_01 {
    //블랙잭
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] inputLine = sc.nextLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for(String i : inputLine){
            arr.add(Integer.parseInt(i));
        }

        int gap = 100000000;
        int max = 0;
        int sum = 0;

        for(int i = 0 ; i <n ; i++){
            for(int j = 0 ; j <n ; j++){
                if(arr.get(i) == arr.get(j)) continue;
                for(int k = 0 ; k <n ; k++){
                    if(arr.get(i) == arr.get(k)) continue;
                    if(arr.get(j) == arr.get(k)) continue;
                    sum = arr.get(i)+arr.get(j)+arr.get(k);
                    if(sum>m) continue;
                    if((m-sum)<gap){
                        gap = m-sum;
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
