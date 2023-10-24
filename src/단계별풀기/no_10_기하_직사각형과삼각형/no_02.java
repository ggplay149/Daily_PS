package 단계별풀기.no_10_기하_직사각형과삼각형;

import java.util.Scanner;

public class no_02 {
    //직사각형에서 탈출
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] length = {
                Integer.parseInt(input[0]),Integer.parseInt(input[1]),
                Integer.parseInt(input[2])-Integer.parseInt(input[0]),
                Integer.parseInt(input[3])-Integer.parseInt(input[1])};
        int min = length[0];
        for(int l : length){
            if(min>l) min = l;
        }
        System.out.print(min);
    }
}
