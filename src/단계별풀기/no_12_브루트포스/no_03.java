package 단계별풀기.no_12_브루트포스;

import java.util.Scanner;

public class no_03 {
    //수학은 비대면강의입니다
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        int a = Integer.parseInt(n[0]),
                b = Integer.parseInt(n[1]),
                c = Integer.parseInt(n[2]),
                d = Integer.parseInt(n[3]),
                e = Integer.parseInt(n[4]),
                f = Integer.parseInt(n[5]);

        for(int x= -999 ; x<=999; x++){
            for(int y= -999 ; y<=999; y++){
                if( ((a*x) + (b*y))== c && ((d*x) + (e*y))== f ){
                    System.out.print(x+" "+y);
                    break;
                }
            }
        }
    }
}
