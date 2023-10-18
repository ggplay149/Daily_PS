package 단계별풀기.no_05_문자열;

import java.io.*;

public class no_10 {
    //다이얼
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t = br.readLine();
        int[] a = new int[t.length()];
        int sum = 0;
        for(int i = 0 ; i<t.length();i++){
            if((int)t.charAt(i) >= 65 && (int)t.charAt(i) <= 67) a[i]=2;
            if((int)t.charAt(i) >= 68 && (int)t.charAt(i) <= 70) a[i]=3;
            if((int)t.charAt(i) >= 71 && (int)t.charAt(i) <= 73) a[i]=4;
            if((int)t.charAt(i) >= 74 && (int)t.charAt(i) <= 76) a[i]=5;
            if((int)t.charAt(i) >= 77 && (int)t.charAt(i) <= 79) a[i]=6;
            if((int)t.charAt(i) >= 80 && (int)t.charAt(i) <= 83) a[i]=7;
            if((int)t.charAt(i) >= 84 && (int)t.charAt(i) <= 86) a[i]=8;
            if((int)t.charAt(i) >= 87 && (int)t.charAt(i) <= 90) a[i]=9;
        }
        for(int i = 0 ; i<a.length;i++){
            if(a[i]==1) sum +=2;
            if(a[i]==2) sum +=3;
            if(a[i]==3) sum +=4;
            if(a[i]==4) sum +=5;
            if(a[i]==5) sum +=6;
            if(a[i]==6) sum +=7;
            if(a[i]==7) sum +=8;
            if(a[i]==8) sum +=9;
            if(a[i]==9) sum +=10;
        }
        System.out.print(sum);
    }
}
