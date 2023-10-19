package 단계별풀기.no_06_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_07 {
    //그룹 단어 체커
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int result=c;

        for(int i = 0 ; i < c ; i++){
            String text = br.readLine();
            boolean[] test = new boolean[26];
            for(int j = 0 ; j<text.length()-1;j++){
                if(text.charAt(j)!=text.charAt(j+1)){
                    if(test[text.charAt(j+1)-97]==true) {
                        result--;
                        break;
                    }
                }
                test[text.charAt(j)-97]=true;
            }
        }
        System.out.print(result);
    }
}
