import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {


    static int n;
    static int[][] map;
    static int num = 1;
    public static void recur(int x, int y){
        if(n %2 == 0) {  //짝수일때
            if(x == n/2 +1){
                return;
            }
        }
        else{ //홀수 일때
            if(x == n /2){
                map[x][y] = num++;
                return;
            }
        }
        //우
        for(int i = y; i< n - y;i++){
            map[x][i] = num++;
        }

        //하
        for(int i = x +1 ; i < n - x; i++){
            map[i][n - 1 - y ] = num++;
        }
        //좌
        for(int i = n -2 -x; i>= y; i--){
            map[n-1-x][i]  = num++;
        }
        //상
        for(int i = n -2 -x; i > x;i--){
            map[i][y] = num++;
        }
        recur(x+1,y+1);

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            StringBuilder sb = new StringBuilder();
            n = Integer.parseInt(br.readLine());
            num = 1;
            map = new int[n][n];
            recur(0,0);
            sb.append("#").append(test_case).append("\n");
            for(int i = 0; i < n;i++){
                for(int j = 0; j<n;j++){
                    sb.append(map[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}