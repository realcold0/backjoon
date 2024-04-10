import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 5
		// 3 1 4 3 2
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] time = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(time);
		int answer = time[0];
		for (int i = 1; i < time.length; i++) {
			time[i] += time[i - 1];
			answer += time[i];
		}

		System.out.println(answer);
	}
}
