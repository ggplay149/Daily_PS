package 단계별풀기.no_05_문자열;

import java.util.Scanner;

public class no_08 {
    //단어의 개수
    public static void main(String[] args){
        while(true){
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine().trim();
        String[] array = r.split(" ");
        int count = array.length;
        if(r=="") count=0;
        System.out.print(count);
    }}
}
