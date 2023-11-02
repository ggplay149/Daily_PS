package 단계별풀기.no_13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class no_11 {
    //좌표 압축
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> input = new ArrayList<>();
        String[] a = br.readLine().split(" ");

        for (int i = 0; i < n; i++){
            input.add(Integer.parseInt(a[i]));
        }
        List<Integer> intStream = input.stream().distinct().collect(Collectors.toList());
        Collections.sort(intStream);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < intStream.size(); i++) map.put(intStream.get(i), i);

        StringBuilder sb = new StringBuilder();
        for (int i : input) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.print(sb);
    }

}
