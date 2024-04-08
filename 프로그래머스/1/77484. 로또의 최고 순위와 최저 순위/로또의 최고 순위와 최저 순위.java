import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank  = {6,6,5,4,3,2,1};
        int[] answer = new int[2];
        ArrayList<Integer> winLotto = new ArrayList<>();
        
        for(int i : win_nums){
            winLotto.add(i);
        }
        //44, 1, 0, 0, 31 25
        //31, 10, 45, 1, 6, 19
        //0이 아닌 다른 수들의 당첨 결과
        //0의 갯수
        int winCount =0;
        int eraseCount =0;
        for(int i =0;i< lottos.length;i++){
            if(lottos[i] == 0){
                answer[0]++;
            }
            else if(winLotto.contains(lottos[i])){
                answer[0]++;
                answer[1]++;
            }
        }
        
        answer[0] = rank[answer[0]];
        answer[1] = rank[answer[1]];

        return answer;
    }
}