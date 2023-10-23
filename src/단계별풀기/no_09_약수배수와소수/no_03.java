package 단계별풀기.no_09_약수배수와소수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class no_03 {
    //약수들의 합
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            if(a==-1)break;
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 1 ; i<=a ; i++) if(a%i==0) arr.add(i);
            int[] num = arr.stream().mapToInt(i->i).toArray();
            Arrays.sort(num);
            int sum = 0;
            for(int i : num) sum+=i;
            if((sum-a) == a ){
                System.out.print(sum-a + " = ");
                for(int i = 0 ; i<num.length-1; i++){
                    if(i == num.length-2) System.out.println(num[i]);
                    else System.out.print(num[i]+" + ");
                }
            }else System.out.println(a + " is NOT perfect.");
        }
    }
}
