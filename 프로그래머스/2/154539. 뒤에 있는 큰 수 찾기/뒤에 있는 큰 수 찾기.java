import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];
        
        for(int i = numbers.length -1; i >= 0; i--){
            while(!stack.empty()){
                if(stack.peek() > numbers[i]){
                    answer[i] = stack.peek();
                    break;
                }
                else{
                    stack.pop();
                }
            }
            if(stack.empty()){
                answer[i] = -1;
            }
            stack.push(numbers[i]);
            
            
        }
        
        return answer;
    }
}