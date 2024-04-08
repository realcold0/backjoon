import java.util.*;
class Solution {
    public int solution(int[] nums) {
        //가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아,
        // 그때의 폰켓몬 종류 번호의 개수를 return 

		//[3,1,2,3]	
		HashSet<Integer> set = new HashSet<>();
		
		for(int i : nums) {
			set.add(i);
		}
		//포켓몬 종류의 갯수
		int kindNum = set.size();
		//50개 에서 25개 골라야하는데
		//20가지 -> 20
		//30가지 -> 25
		int answer = 0;
		if(kindNum >= nums.length / 2) {
			answer = nums.length /2;
		}
		else {
			answer = kindNum;
		}
		
        return answer;
    }
}