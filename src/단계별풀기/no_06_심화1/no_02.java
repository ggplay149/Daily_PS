package 단계별풀기.no_06_심화1;

import java.util.Scanner;

public class no_02 {
    //킹, 퀸, 룩, 비숍, 나이트, 폰
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] r = {1,1,2,2,2,8};
        for(int i = 0 ; i<6 ;i++){
            r[i]= r[i]-(Integer.parseInt(arr[i]));
        }
        for(int c : r) System.out.print(c+" ");
    }
}
