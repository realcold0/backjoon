import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[][] branch;
    static Queue<Integer> queue = new LinkedList<>();
    static int N,M,V;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        branch = new int[N+1][N+1];

        while(M --> 0){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            branch[a][b] = 1;
            branch[b][a] = 1;
        }
        dfs(V);
        System.out.println();
        Arrays.fill(visited, false);
        bfs(V);
    }


    //재귀를 이용해서 구현
    public static void dfs(int node){
        System.out.print(node + " ");
        visited[node] = true;
        for(int i =1 ;i <= N; i++)
        {
            if(branch[node][i] == 1 && visited[i]  == false){
                dfs(i);
            }
        }
    }

    //큐를 이용해서 구현
    public static void bfs(int node){
        queue.offer(node);
        visited[node] = true;

        //큐에서 꺼내서 출력하고 자식 노드들을 넣고
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            System.out.print(tmp + " ");


            for(int i =1; i <= N; i++){
                if(branch[tmp][i] == 1 && visited[i]  == false){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }



    }
}