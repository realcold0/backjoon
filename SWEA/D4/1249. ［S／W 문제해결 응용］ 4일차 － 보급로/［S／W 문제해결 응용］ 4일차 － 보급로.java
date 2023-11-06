import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
public class Solution {
    public static int n;
    public static int[][] map;
    public static boolean[][] visited;
    public static int min = Integer.MAX_VALUE;
    public static int[] moveX = {1, 0, -1, 0}; //우하좌상
    public static int[] moveY = {0, 1, 0, -1}; //우하좌상
    public static void main(String[] args) throws Exception {

        int T;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            min = Integer.MAX_VALUE;
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            visited = new boolean[n][n];

            for(int i = 0; i<n;i++){ //맵에 시간들을 다 넣어준다.
                String mapLine = br.readLine();
                for(int j = 0; j<n;j++){
                    map[i][j] = Character.getNumericValue(mapLine.charAt(j));
                }
            }
            bfs(0,0);

            sb.append("#").append(test_case).append(" ").append(min).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs(int x, int y){
        PriorityQueue<Pos> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Pos(x,y,0));
        visited[x][y] = true;

        while(!priorityQueue.isEmpty()){
            Pos p = priorityQueue.poll();

            int curX = p.x;
            int curY = p.y;
            int curTime = p.time;

            if(curX == n-1 && curY == n-1){ //끝에 도착시
                if(curTime < min ){ //만약 제일 작은 값이라면
                    min = curTime;
                }
            }

            for(int i = 0;i<4;i++){
                int nextX = curX +moveX[i];
                int nextY = curY +moveY[i];

                if(nextX < 0 || nextY <0 || nextX > n-1 ||nextY > n-1){
                    continue;
                }
                if(!visited[nextX][nextY]){ //방문했던곳이 아니라면
                    int totalTime = curTime + map[nextX][nextY];
                    visited[nextX][nextY] = true;
                    priorityQueue.add(new Pos(nextX, nextY, totalTime));

                }
            }
        }


    }

     public static class Pos implements Comparable<Pos>{
        int x;
        int y;
        int time;

        public Pos(int x, int y, int time){
            this.x=x;
            this.y = y;
            this.time = time;
        }
        @Override
        public int compareTo(Pos pos){
            if(this.time > pos.time){
                return 1;
            }
            else if(this.time == pos.time){
                return 0;
            }
            else{
                return -1;
            }

        }

    }
}