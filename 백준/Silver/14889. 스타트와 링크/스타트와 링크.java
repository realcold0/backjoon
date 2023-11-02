import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] map;
    static boolean[] visit;
    static int MIN = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n];
        //능력치 표 삽입
        for(int i =0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j =0;j<n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0);
        System.out.println(MIN);
    }

    public static void dfs(int index, int count){
        if(index == n/2){
            int start =0;
            int link =0;
            for(int i =0;i< n-1;i++){
                for(int j = i+ 1; j< n;j++ ){
                    if (visit[i] == true && visit[j] == true) { //start team
                        start += map[i][j];
                        start += map[j][i];
                    }
                    else if(visit[i] == false && visit[j] == false){ //link team
                        link += map[i][j];
                        link += map[j][i];
                    }
                }
            }
            int result =Math.abs( start - link);
            if(result == 0){
                System.out.println(0);
                System.exit(0);
            }
            MIN = Math.min(MIN, result);
            return;
        }

        for(int i = count; i < n ; i++){ //팀 나누기
            if(!visit[i]){
                visit[i] = true;
                dfs(index +1 , i+1);
                visit[i] = false;
            }

        }
    }

}