import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		Arrays.sort(d);
	
        int answer = 0;
		for(int i : d) {
			if(budget >=  i) {
				budget -= i;
                answer++;
			}
			
		}
		
		
		return answer;
	}
}