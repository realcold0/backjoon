import java.util.Comparator;
import java.util.Arrays;

class Solution {
    public int getParent(int parent[], int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent, parent[x]);
	}
	public void unionParent(int parent[], int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a < b) parent[b] = a;
		else parent[a] = b;
	}
	public boolean findParent(int parent[], int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		
		if( a==b) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int solution(int n, int[][] costs) {
		//[[0,1,1],[0,2,2],[1,2,5],[1,3,1],[2,3,8]]
		int answer = 0;
		int[] parent = new int[n];
        for(int i = 0; i < parent.length; i++){
            parent[i] = i;
        }
        
        Arrays.sort(costs, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
		
		for(int i = 0; i< costs.length; i++) {
			if(!findParent(parent, costs[i][0], costs[i][1])) {
				answer += costs[i][2];
				unionParent(parent, costs[i][0], costs[i][1]);
			}
		}
		
		

		return answer;
	}

}