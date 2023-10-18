package 단계별풀기.no_06_심화1;

import java.io.*;

public class no_05 {
    //단어 공부
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine().toUpperCase();
        br.close();

        int[] arr = new int[26];

        for(int i = 0; i< a.length(); i ++){
            arr[a.charAt(i)-65]++;
        }

        int max = -1;
        char c = '?';

        for(int i = 0; i< 26; i ++){
            if(arr[i]>max){
                max = arr[i];
                c = (char)(i+65);
            }
            else if(arr[i]==max) c='?';
        }
        bw.write(c);
        bw.flush();
        bw.close();
    }
}
