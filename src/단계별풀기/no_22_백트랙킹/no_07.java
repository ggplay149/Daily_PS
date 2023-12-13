package 단계별풀기.no_22_백트랙킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_07{
    //연산자 끼워넣기

    static int n = 0 ;
    static long max = -1000000000;
    static long min = 1000000000;
    static int result = 0;
    static int count = 1;
    static int[] arr;
    static int[] test;

    static int[] arrMath;
    static String[] resultArr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[2*n-1];
        visit = new boolean[n-1];
        test = new int[n-1];
        arrMath = new int[n-1];
        resultArr = new String[n-1];

        String input = "";

        //숫자 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 2*n-1; i+=2 ){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //연산자 받기
        int at = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 4 ; i ++ ){
            int count = Integer.parseInt(st.nextToken());
            for(int j = at ; j < count+at ; j ++ ){
                arrMath[j] = i;
            }
            at+= count;
        }
        dfs(0);
        System.out.println(max);
        System.out.print(min);
    }

    //dfs
    public static void dfs(int depth){
        if(depth==n-1){
            int count =0;
            for(int i = 1 ; i < arr.length ; i +=2 ){
                arr[i] = test[count++];
            }
            result = arr[0];
            for(int i = 1 ; i < arr.length ; i +=2 ){
                switch (arr[i]){
                    case 0 :
                        result += arr[i+1];
                        break;
                    case 1 :
                        result -= arr[i+1];
                        break;
                    case 2 :
                        result *= arr[i+1];
                        break;
                    case 3 :
                        if(result<0){
                            int tmp = result*(-2);
                            result += result*(-2);
                            result /= arr[i+1];
                            result -= result*2;
                        }
                        else result /= arr[i+1];
                        break;
                }
            }

            if(max<result){
                max = result;
            }
            if(min>result){
                min = result;
            }
            return;
        }
        for(int i = 0 ; i < n-1 ; i ++ ){
            if(!visit[i]){
                visit[i]=true;
                test[depth] = arrMath[i];
                dfs(depth+1);
                visit[i] =false;
            }
        }
    }
}