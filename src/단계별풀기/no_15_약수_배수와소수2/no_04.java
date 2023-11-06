package 단계별풀기.no_15_약수_배수와소수2;

import java.util.Scanner;

public class no_04 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for(int i = 0 ; i<n ; i++) input[i]= sc.nextInt();

        int answer = (input[0]+input[input.length-1]/2) -n;
        System.out.print(answer);
    }
}
