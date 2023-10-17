package 단계별풀기.no_04_1차원배열;

import java.util.ArrayList;
import java.util.Scanner;

public class no_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();


        for(int i = 0; i <10 ; i++){

            int flag = 0;
            int a = sc.nextInt();

            if(a%42!=0 && arr.size()==0) arr.add(a%42);

            else{
                for(int j = 0; j<arr.size();j++){
                    if(arr.get(j)==a%42){flag=1;break;}
                }
                if(flag==0)arr.add(a%42);
            }
        }

        System.out.print(arr.size());

    }
}
