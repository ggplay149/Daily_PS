package 단계별풀기.no_04_1차원배열;
import java.util.Scanner;
public class no_02 {
    //X보다 작은 수
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] num = new int[n];

        for(int i = 0; i<n ; i++){
            num[i]=sc.nextInt();
        }
        for(int i = 0; i<n ; i++){
            if(num[i]<x) System.out.print(num[i]+" ");
        }

    }
}
