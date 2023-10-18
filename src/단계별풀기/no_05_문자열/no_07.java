package 단계별풀기.no_05_문자열;

import java.util.Scanner;

public class no_07 {
    //문자열 반복
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i = 0 ; i < r ; i++){
            int c = sc.nextInt();
            String text = sc.next();

            for(int j = 0 ; j < text.length() ; j++){
                for(int k = 0 ; k < c ; k++){
                    System.out.print(text.charAt(j));
                }
            }
            System.out.println("");
        }
    }
}
