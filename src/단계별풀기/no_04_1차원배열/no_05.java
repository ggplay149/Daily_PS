import java.util.Scanner;

public class no_05{
    //공 넣기
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] result = new int[n];

        for( int x = 0; x < result.length ; x++){
            result[x] = 0;
        }


        for( int x = 0 ; x < m ; x++){

            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for( int y = i-1 ; y<j ;y++){
                result[y]=k;
            }
        }

        for( int x = 0; x < result.length ; x++){
            System.out.print(result[x]+" ");
        }
    }
}