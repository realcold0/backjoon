import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T= Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = Integer.parseInt(br.readLine());
            int[] days = new int[n];
            int max = Integer.MIN_VALUE;
            long sum= 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int i = 0;i<n;i++){ //전부 넣기
                days[i] = Integer.parseInt(st.nextToken());
            }
            for(int i= n-1;i >= 0; i--){ //뒤에서 부터
                if(days[i] > max){
                    max = days[i];
                }
                if(i != n-1){
                    sum += max - days[i];
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append(" ").append(sum);
            System.out.println(sb);
        }
    }
}