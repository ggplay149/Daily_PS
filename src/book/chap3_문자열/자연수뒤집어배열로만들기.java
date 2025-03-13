package book.chap3_문자열;
public class 자연수뒤집어배열로만들기 {
    public static void main (String args[]){

        long n = 12345;
        String reversed = new StringBuilder(Long.toString(n)).reverse().toString();
        char[] arr = reversed.toCharArray();
        int[] answer = new int[arr.length];
        for(int i  = 0 ; i < answer.length; i ++) {
            answer[i] = arr[i] - '0';
        }
    }
}
