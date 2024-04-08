import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        //두 사람이 선물을 주고받은 기록이 하나도 없거나 주고받은 수가 같다면,
        //선물 지수가 더 큰 사람이 선물 지수가 더 작은 사람에게 선물을 하나 받습니다.
        //선물 지수는 이번 달까지 자신이 친구들에게 준 선물의 수에서 받은 선물의 수를 뺀 값
        
        //두 사람이 선물을 주고받은 기록이 있다면, 
        //이번 달까지 두 사람 사이에 더 많은 선물을 
        //준 사람이 다음 달에 선물을 하나 받습니다
        
        //다음달에 가장 많은 선물을 받는 친구가 받을 선물의 수를 
        //return 하도록 solution 함수를 완성해 주세요.
        int[][] map = new int[friends.length + 1][friends.length + 1];
        int[] point = new int[3];
        int end = map.length -1;
        int answer = 0;
        
        for(String str : gifts){ //준 선물 표
            StringTokenizer st = new StringTokenizer(str);
            int x = Arrays.asList(friends).indexOf(st.nextToken());
            int y = Arrays.asList(friends).indexOf(st.nextToken());
            map[x][y]++;
            map[x][end]++; //준거
            map[end][y]++; //받은거
        }
        
        for(int i =0;i < friends.length; i++){
            int count =0;//내가 받을 갯수
            for(int k = 0; k < friends.length;k++){
                if(i != k){
                    //준 횟수가 0이거나 같다면
                    if( map[i][k] == map[k][i]){
                        if(map[i][end] - map[end][i] > map[k][end] - map[end][k]){ //지수 비교
                            count++;
                            if(answer <= count){
                                answer = count;
                            }
                        }
                    }
                    //내가 더 많이 줬다면
                    if(map[i][k] > 0 && map[i][k] > map[k][i]){
                        count++;
                        if(answer <= count){
                            answer = count;
                        }
                    }
                    
                }
            }
        }
        
 
        return answer;
    }
}