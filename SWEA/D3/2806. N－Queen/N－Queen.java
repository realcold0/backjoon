import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution{
	public static int n;
	public static int count;
	public static int[] map;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int T = Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			count =0;
			n = Integer.parseInt(br.readLine());
			
			map = new int[n];
			
			dfs(0);
			
			sb.append("#").append(test_case).append(" ").append(count).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void dfs(int index) {
		if(index == n ) {
			count++;
			return;
		}
		for(int i = 0;i<n;i++) {
			map[index] = i;
			if(check(index)) {
				dfs(index +1);
			}
		}
	}
	
	public static boolean check(int index) {
		for(int k = 0;k<index;k++) { //첫번째 부터 지금까지 확인
			if(map[k] == map[index] || map[k] + (index - k) == map[index] || map[index] + (index - k) == map[k]) {
				return false;
			}
		}
		return true;
	}
}