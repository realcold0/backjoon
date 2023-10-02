import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main {

    static int n;
    static int[] t, p,dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        t = new int[n+1]; //0~
        p = new int[n+1]; //0~7
        dp = new int[n+2]; //0~8

        for(int i =1; i<=n;i++){
            st = new StringTokenizer(br.readLine());
            t[i]  = Integer.parseInt(st.nextToken());
            p[i]  = Integer.parseInt(st.nextToken());
        }


        //끝에서 부터 할 수 있는 날짜인지 확인
        for(int i = n; i > 0; i--){ //i = 7에서 시작
            //i+t[i] == 다음 일하는 날짜
            if(i + t[i] -1 > n ){ //일할수 없다.
                dp[i] = dp[i+1];
            }else{// 일할수 있다.
                dp[i] =  Math.max(dp[i+1],p[i] + dp[i + t[i]]);

            }
        }

        System.out.println(dp[1]);
    }
    

}