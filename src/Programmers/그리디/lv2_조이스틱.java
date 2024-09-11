package Programmers.그리디;

public class lv2_조이스틱 {

    public static void main(String[] args){

        String name = "JEROEN";
        int answer = 0;
        int length = name.length();

        //오른쪽으로 계속끝까지 갈경우의 최대 이동수로 초기화
        int move = length-1;

        for(int i = 0; i < length; i++){

            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            //다음이 A면 연속된 A수 카운트
            int aIndex = i+1;
            while(aIndex<length && name.charAt(aIndex)=='A'){
                aIndex++;
            }

            move = Math.min(move,i*2+length-aIndex);    //A직전까지 갔다 돌아온후 왼쪽으로 돌아가는경우
            move = Math.min(move,(length-aIndex)*2+i); //왼쪽으로 돌아가서 A직후 까지 갔다가 돌아온후 A직전까지 가는경우우

        }        System.out.println(answer+move);
    }
}

