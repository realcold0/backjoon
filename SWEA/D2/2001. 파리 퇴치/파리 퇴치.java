import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution{

	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[n][n];
			int[][] prefixSum = new int[n+1][n+1];
			
			
			for (int i = 0; i < n; i++) { //2차원 prefix
				StringTokenizer st2 = new StringTokenizer(br.readLine() , " ");
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st2.nextToken());
					prefixSum[i+1][j+1] = prefixSum[i+1][j] + prefixSum[i][j+1] - prefixSum[i][j] +map[i][j];
				}
			}
			
			int max = Integer.MIN_VALUE;
			for (int i = m; i < n +1; i++) {
				for (int j = m; j < n+1; j++) {
					int tmp = prefixSum[i][j] - prefixSum[i-m][j] - prefixSum[i][j-m] + prefixSum[i-m][j-m];
					if(tmp > max) {
						max = tmp;
					}
				}
			}
			sb.append("#").append(test_case).append(" ").append(max).append("\n");
		}
		System.out.println(sb);
	}
}