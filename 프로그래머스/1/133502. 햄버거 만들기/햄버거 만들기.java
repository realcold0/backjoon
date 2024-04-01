import java.util.*;

class Solution {
     public int solution(int[] ingredient) {
        //빵 – 야채 – 고기 - 빵
        //1-2-3-1 일때
        Stack<Integer> ingredientList = new Stack<>();
     
        
         //[2, 1, 1, 2, 3, 1, 2, 3, 1]
        int answer = 0;
         
        for(int i : ingredient){
            ingredientList.add(i);
            if(ingredientList.size() >= 4){ //4개 이상 쌓이면
                int index = ingredientList.size() -1;
                if(ingredientList.get(index -3) == 1 && ingredientList.get(index-2) == 2 
                   && ingredientList.get(index-1) ==3 && ingredientList.get(index) ==1){
                    ingredientList.pop();
                    ingredientList.pop();
                    ingredientList.pop();
                    ingredientList.pop();
                    answer++;
                    
                }
            }
            
            
        }
        
        

        return answer;
    }
}