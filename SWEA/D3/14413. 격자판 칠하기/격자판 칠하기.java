import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Pos{
    int x;
    int y;
    public Pos(int x , int y ) {
        this.x = x;
        this.y = y;
    }
}

public class Solution {
    public static char[][] map;
    public static boolean[][] visited;
    public static int n;
    public static int m;
    public static StringBuilder sb = new StringBuilder();
    public static char sharp = '#';
    public static char dot = '.';

    public static int[] moveX = {1,0,-1,0};
    public static int[] moveY = {0,1,0,-1};
    
    
   private static ArrayList<Pos> arrayQueue = new ArrayList<Pos>();
    
    public static void enQueue(Pos pos) {
    	arrayQueue.add(pos);
    }
    public static Pos deQueue() {
    	int len = arrayQueue.size();
    	if(len == 0) {
    		return null;
    	}
    	return arrayQueue.remove(0);
    }
    public static void clearQueue() {
    	arrayQueue.clear();
    }
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            map = new char[n][m];
            visited = new boolean[n][m];
            int startX = 0;
            int startY = 0;
            for (int i = 0; i < n; i++) { //다 넣어주고
                String input = br.readLine();
                for (int j = 0; j < m; j++) {
                    map[i][j] = input.charAt(j);
                    if(map[i][j] == sharp ||map[i][j] == dot) {
                    	startX = i;
                    	startY  =j;
                    }
                }
            }


            System.out.print("#" + test_case + " ");
            bfs(startX, startY);

        }
    }

 

    public static void bfs(int x, int y){
        /**
         * 현재 char값 가져온다. #인지 .인지
         * #이라면 상하좌우가 . 인지 확인
         * ? 가잇으면 가서 . 으로 바꾼다.
         * #이 있으면
         */
        clearQueue();
        enQueue(new Pos(x, y));
    	
        while(!arrayQueue.isEmpty()){
            Pos curPos = deQueue(); //현재 값가져와서
            char curChar = map[curPos.x][curPos.y];
            int curX = curPos.x;
            int curY = curPos.y;
            visited[curX][curY] = true;


            if(curChar == sharp){ //상하좌우가 #이라면
                for (int i = 0; i < 4; i++) {
                    if(curX + moveX[i] < 0 ||curY + moveY[i] < 0 || curY + moveY[i] > m -1|| curX + moveX[i] > n -1  ){
                        continue;
                    }
                    char tmp = map[curX + moveX[i]][curY + moveY[i]];
                    if(tmp == sharp){
                        System.out.println("impossible");
                        return;
                    }
                    if(tmp == '?'){
                        map[curX + moveX[i]][curY + moveY[i]] = dot;
                    	visited[curX+moveX[i]][curY + moveY[i]] = true;
                        enQueue(new Pos(curX+moveX[i], curY + moveY[i])); //이동할 좌표 넣어줌
                    }
                    if(tmp == dot && visited[curX+moveX[i]][curY + moveY[i]] == false) {
                    	visited[curX+moveX[i]][curY + moveY[i]] = true;
                    	enQueue(new Pos(curX+moveX[i], curY + moveY[i])); //이동할 좌표 넣어줌
                    }


                }
            }


            if(curChar == dot){ //상하좌우가 #이라면
                for (int i = 0; i < 4; i++) {
                    if(curX + moveX[i] < 0 ||curY + moveY[i] < 0 || curY + moveY[i] > m -1|| curX + moveX[i] > n -1  ){
                        continue;
                    }
                    char tmp = map[curX + moveX[i]][curY + moveY[i]];
                    if(tmp == dot){
                        System.out.println("impossible");
                        return;
                    }
                    if(tmp == '?'){
                        map[curX + moveX[i]][curY + moveY[i]] = sharp;
                        visited[curX+moveX[i]][curY + moveY[i]] = true;
                        enQueue(new Pos(curX+moveX[i], curY + moveY[i])); //이동할 좌표 넣어줌
                    }
                    if(tmp == sharp && visited[curX+moveX[i]][curY + moveY[i]] == false) {
                    	visited[curX+moveX[i]][curY + moveY[i]] = true;
                    	enQueue(new Pos(curX+moveX[i], curY + moveY[i])); //이동할 좌표 넣어줌
                    }

                }
            }

        }
        System.out.println("possible");

    }


}