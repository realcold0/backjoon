import java.util.ArrayList;
import java.util.Collections;

class Solution {
 //체육수업을 들을 수 있는 학생의 최댓값을 return
    //바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다
    public int solution(int n, int[] lost, int[] reserve) {
        //lost의 앞뒤로 reserve를 찾기
        //or
        //reserve 앞뒤로 lost찾기
        ArrayList<Integer> lostList = new ArrayList<>();
        ArrayList<Integer> reserveList = new ArrayList<>();
        for(int i:lost){
            lostList.add(i);
        }
        for(int i:reserve){
            reserveList.add(i);
        }

        Collections.sort(lostList);
        Collections.sort(reserveList);


        int count = 0;

        //여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다.
        // 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
        // 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.

        // 5 [2,4] [2,3,5]

         for(int i = 0; i<lostList.size();){
            if(reserveList.contains(lostList.get(i))){
                reserveList.remove(lostList.get(i));
                lostList.remove(i);  // 5 [2,4] [2,3,5] -> [4] [3,5]
            }
            else{
                i++;
            }
        }

        for(int i = 0; i< lostList.size(); i++){
            for(int k =0; k< reserveList.size(); k++){
                if(lostList.get(i) - 1 == reserveList.get(k) || lostList.get(i) + 1 == reserveList.get(k)){
                    reserveList.remove(k);
                    count++;
                    break;
                }
            }
        }

        int answer = n - lostList.size() + count;
        return answer;
    }
}