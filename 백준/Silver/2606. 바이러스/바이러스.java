import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int map[][];
    static  boolean check[];
    static int count =0;
    static int num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        map = new int[num + 1 ][num + 1];
        check = new boolean[num +1];
        int temp = Integer.parseInt(br.readLine());

        for(int i =0;i < temp;i++){ //연결된 수 만큼
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x][y] = map[y][x] = 1;

        }

        dfs(1);
        System.out.println(count-1);

    }
    public static void dfs(int node){
        check[node] = true;
        count++;

        for(int i =1 ;i<=num;i++){
            if(map[node][i] == 1 && check[i] == false){
                dfs(i);
            }
        }
    }



}