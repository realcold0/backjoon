import java.util.*;

class Solution {
   public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i =0;i<numbers.length -1;i++){
            for(int k=i+1; k < numbers.length; k++){
                int temp= numbers[i] + numbers[k];
                if(!arr.contains(temp)){
                    arr.add(temp);
                }
            }
        }
        
        return arr.stream().sorted().mapToInt(i -> i).toArray();
        
    }
}