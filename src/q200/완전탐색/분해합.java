package q200.완전탐색;


import java.util.Scanner;
public class 분해합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer= 0;
        sc.close();

        for(int i = 1 ; i <= n ; i ++){
            String[] number = String.valueOf(i).split("");
            int sum = i ;
            for(int j = 0 ; j <  number.length ; j++) sum += Integer.parseInt(number[j]);
            if(sum == n){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
