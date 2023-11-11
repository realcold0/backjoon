import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;


class Solution{
	static int count = 0;
	static int maxCount = 0;
	static int x = 0;
	static int max = Integer.MIN_VALUE;
	public static void main(String args[]) throws Exception
	{
		int T;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		StringBuilder sb =  new StringBuilder();
		for(int test_case = 1; test_case <= T; test_case++){
			int t = Integer.parseInt(br.readLine());
			max = Integer.MIN_VALUE;
			maxCount = 0;
			count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			List<Integer> stus = new ArrayList<Integer>();
			while(st.hasMoreTokens()) {
				stus.add(Integer.parseInt(st.nextToken()));
			}
			stus = stus.stream().sorted().collect(Collectors.toList());
 			x =stus.get(0);
			
 			stus.stream().forEach(i ->{
				if(x == i) {
					count++;
					if(count >= maxCount) {
						maxCount = count;
						max = i;
					}
				}
				else {
					
					count = 1;
					x = i;
				}
			});
			
			sb.append("#").append(test_case).append(" ").append(max).append("\n");
			
			
		}
		System.out.println(sb);
		
	}
}