import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[46]; //45보다 작거나 같은 자연수
        dp[1] = 1;
        if(n<2){
            System.out.println(dp[n]);
            return;
        }
        for(int i = 2; i <=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);

    }


}