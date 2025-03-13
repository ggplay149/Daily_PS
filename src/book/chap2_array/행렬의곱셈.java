package book.chap2_array;
public class 행렬의곱셈 {
    public static void main(String[] args){

        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};

        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0 ; i < answer.length ; i ++){
            for(int j = 0 ; j < answer[i].length ; j++){
                answer[i][j] = 0;
                for(int k = 0 ; k < arr1[i].length ; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }

        }
    }
}
