package 단계별풀기.no_06_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class no_06 {
    //크로아티아 알파벳
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(a.split("")));
        ArrayList<String> result = new ArrayList<>();

        String[] b = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;

        for (int i = 0; i < arr.size() - 1; i++) {

            //마지막 남은글자
            if (arr.size() == 1) {
                result.add(arr.get(i));
                break;
            }

            //확인할문자
            String chk = arr.get(i) + arr.get(i + 1);

            //확인할문자 'dz=' 구분
            if (arr.size() - i > 2) { //마지막에  "dz="오면 인덱스방지
                if (chk.equals("dz") && arr.get(i + 2).equals("=")) {
                    chk = arr.get(i) + arr.get(i + 1) + arr.get(i + 2);
                }
            }

            if (chk.equals("c=")
                    || chk.equals("c-")
                    || chk.equals("dz=")
                    || chk.equals("d-")
                    || chk.equals("lj")
                    || chk.equals("nj")
                    || chk.equals("s=")
                    || chk.equals("z=")
            ) {
                result.add(chk);
                count++;
                if (chk.equals("dz=")) {
                    arr.remove(i);
                    arr.remove(i);
                    arr.remove(i);
                } else {
                    arr.remove(i);
                    arr.remove(i);
                }
                i--;
            }

        }

        for (String x : arr) result.add(x);
        System.out.print(result.size());
    }
}
