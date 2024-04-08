import java.util.*;
class Solution {
    public static boolean check(String s) {
		//"[](){}"	
        Stack<Character> stack = new Stack<>();
		for(int i = 0;i< s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) {
				stack.add(s.charAt(i));
			}else {
				if(stack.empty()) {
					return false;
				}
                char prev = stack.pop();
			    if((s.charAt(i) == ']' && prev == '[' )|| (s.charAt(i) == '}' && prev == '{' )
                   || (s.charAt(i) == ')' && prev == '(' )) {
					
				}
                else{
                    return false;
                }
			}
		}
		
		if(stack.empty()) {
			return true;
		}
		
		return false;
	}
	public int solution(String s) {
        //왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때
        int answer = 0;
        
        if(check(s)) {
        	answer++;
        }
        
        for(int i = 0; i < s.length() - 1; i++) {
        	s = s.substring(1) + s.charAt(0);
        	if(check(s)) {
            	answer++;
            }
        }
        
        
        
        
        return answer;
        
    }
}