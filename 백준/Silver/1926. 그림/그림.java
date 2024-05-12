import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count =0;
        int maxArea = 0;
        int map[][] = new int[n][m];
        boolean checked[][] = new boolean[n][m];
        //주어진 map만듬
        for(int i =0;i < n ;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for(int j =0;j<m;j++){
                map[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        //지나다니면서 count가져옴
        for(int i =0;i < n ;i++){
            for(int j =0;j<m;j++){
                if(map[i][j] == 1 && checked[i][j] == false){
                    int area = bfs(map, checked, i , j);
                    if(area > maxArea){
                        maxArea = area;
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(maxArea);
    }

    public static int bfs(int[][] map, boolean[][] checked, int x , int y){
        Queue<Point> queue = new LinkedList<>();
        checked[x][y] =true;
        queue.add(new Point(x,y));
        int count = 1;

        int dx[] = {1, -1, 0,0};
        int dy[] = { 0,0, 1, -1};
        while(!queue.isEmpty()){
            Point current = queue.poll();
            for(int i = 0; i< 4;i++){
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if(nextX >= 0 && nextX < map.length && nextY >=0 && nextY < map[0].length && map[nextX][nextY] == 1 && checked[nextX][nextY] == false){
                    queue.add(new Point(nextX,nextY));
                    checked[nextX][nextY] = true;
                    count++;
                }

            }

        }

        return count;
    }

}