import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int max;
    static int[] moneyInt ;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T= Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            max = Integer.MIN_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String money = st.nextToken();
            moneyInt = new int[money.length()];
            n = Integer.parseInt(st.nextToken());
            for(int i =0;i<money.length();i++){
                moneyInt[i] = Character.getNumericValue(money.charAt(i));
            }

            if (moneyInt.length < n) {
                n = moneyInt.length;
            }
            dfs(0,0);
            sb.append("#").append(test_case).append(" ").append(max).append("\n");

        }
        System.out.println(sb);
    }
    public static void dfs(int start, int count ){
        if(count == n){
            StringBuilder st = new StringBuilder();
            for(int a : moneyInt){
                st.append(a);
            }
            max = Math.max(max, Integer.parseInt(st.toString()));
            return;
        }
        for (int i = start; i < moneyInt.length; i++) {
            for (int j = i + 1; j < moneyInt.length; j++) {
                int tmp = moneyInt[i];
                moneyInt[i] = moneyInt[j];
                moneyInt[j] = tmp;

                dfs(i,count +1);

                tmp = moneyInt[i];
                moneyInt[i] = moneyInt[j];
                moneyInt[j] = tmp;
            }
        }
    }
}