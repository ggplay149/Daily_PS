package 단계별풀기.no_04_1차원배열;
import java.util.Scanner;
public class no_01 {
    //개수 세기
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] num = new int[a];

        int count = 0;

        for(int i = 0; i < num.length ; i++){
            num[i] = sc.nextInt();
        }

        int b = sc.nextInt();

        for(int i = 0; i < num.length ; i++){
            if(num[i] == b) count++;
        }

        System.out.print(count);

    }
}
