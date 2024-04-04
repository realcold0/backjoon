import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        //할인하는 제품은 하루에 하나씩만 구매할 수 있습니다.
        //자신이 원하는 제품과 수량이 할인하는 날짜와 
        //10일 연속으로 일치할 경우에 맞춰서 회원가입을 하려 합니다.
                
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }
        
        for(int i = 0; i < discount.length - 9; i++){ //discount에서 시작점
            Map<String, Integer> discountMap = new HashMap<>();
            
            for(int k = 0; k< 10;k++){
                discountMap.put(discount[i + k], discountMap.getOrDefault(discount[i + k], 0) +1);
            }
            
            Boolean compare = true;
            
            for(String key : map.keySet()){
                if(map.get(key) != discountMap.get(key)){
                    compare = false;
                    break;
                }
            }
            
            if(compare){
                answer += 1;
            }
        }
        return answer;
    }
}