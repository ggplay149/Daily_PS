package 단계별풀기.no_08_일반수학1;

import java.io.*;

public class no_07 {
    //달팽이는 올라가고 싶다
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int up = Integer.parseInt(input[0]);		// A
        int down = Integer.parseInt(input[1]);	// B
        int length = Integer.parseInt(input[2]);	// C

        int day = (length - down) / (up - down);

        // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if ((length - down) % (up - down) != 0) {
            day++;
        }
       System.out.println(day);
    }
}
