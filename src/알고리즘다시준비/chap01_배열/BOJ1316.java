package 알고리즘다시준비.chap01_배열;

import java.util.*;

public class BOJ1316{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();  // nextInt() 뒤에 개행 문자 처리
        int count = 0;
        for(int i = 0 ; i < num ; i ++){
            String input = sc.nextLine();
            if(check(input)) count++;
        }
        System.out.print(count);
    }

    static boolean check(String str){

        Set<Character> set = new HashSet<>();
        char preChar = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char currentChar = str.charAt(i);
            if(currentChar != preChar && set.contains(currentChar)){
                return false;
            }
            set.add(currentChar);
            preChar = currentChar;
        }
        return true;
    }
}