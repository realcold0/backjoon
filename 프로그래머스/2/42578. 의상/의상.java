import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        //[의상의 이름, 의상의 종류]
        //머리 2개
        //의상 1개
        //하의 3개
        //1개씩 -> 6개
        //2개씩 -> 2 *1 + 1*3 + 2*3
        //3개씩 -> 2 * 1 * 3
        HashMap<String, Integer> hash = new HashMap<>();
        for(int i=0;i <clothes.length; i++){
             hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1], 0) + 1); 
        }
        
        int answer = 1;
        
        for(String str : hash.keySet()){
            answer *= hash.get(str) + 1;
        }
        answer--;
        return answer;
    }
}