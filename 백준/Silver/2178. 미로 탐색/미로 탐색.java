import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int map[][];
    static boolean check[][];
    static int count = 0;
    static int n,m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        check = new boolean[n][m];

        //n,m까지 map넣기
        for(int i =0; i<n;i++){
            String line = br.readLine();
            for(int j=0; j<m;j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0,0);


    }
    public static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x,y));
        check[x][y] = true;


        int dx[] = {1,-1,0,0};
        int dy[] = {0,0,1, -1};
        while(!queue.isEmpty()){
            Point current = queue.poll();
            int curX = current.x;
            int curY = current.y;


            for(int i=0;i<4;i++){
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if(nextX >=0 && nextX < n && nextY >=  0 && nextY < m
                && map[nextX][nextY] == 1 && check[nextX][nextY] == false){
                    queue.add(new Point(nextX, nextY));
                    check[nextX][nextY] = true;
                    map[nextX][nextY] = map[curX][curY] + 1;
                }
            }

        }
        System.out.println(map[n-1][m-1]);

    }




}