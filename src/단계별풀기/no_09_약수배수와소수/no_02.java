package 단계별풀기.no_09_약수배수와소수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class no_02 {
    //약수 구하기
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1 ; i<=a ; i++){
            if(a%i==0) arr.add(i);
        }

        int[] num = arr.stream().mapToInt(i->i).toArray();
        Arrays.sort(num);
        try{
            System.out.print(num[b-1]);
        }catch (Exception e){
            System.out.print(0);
        }
    }
}
