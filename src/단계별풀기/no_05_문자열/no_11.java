package 단계별풀기.no_05_문자열;

import java.io.*;

public class no_11 {
    //그대로 출력하기
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = "";
        while((a=br.readLine())!=null){
            bw.write(a);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
