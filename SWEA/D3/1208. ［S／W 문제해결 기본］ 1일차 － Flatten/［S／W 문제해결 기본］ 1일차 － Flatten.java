import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution{
		
		public static void main(String args[]) throws Exception
		{
			int T = 10;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			for(int test_case = 1; test_case <= T; test_case++)
			{
				int arr[] = new int[100];
				int n = Integer.parseInt(br.readLine());
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int i = 0;
				while(st.hasMoreTokens()) { //다 넣기 
					arr[i] = Integer.parseInt(st.nextToken());
					i++;
				}
				for(int k =0 ;k < n;k++) {
					Arrays.sort(arr);
					arr[0]++;
					arr[arr.length -1]--;
				}
				Arrays.sort(arr);
				sb.append("#").append(test_case).append(" ").append(arr[arr.length-1] -arr[0]).append("\n");
				
				
			}
			System.out.println(sb);
		}
	}