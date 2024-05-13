import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static boolean check[];
    public static int answer[];
    static StringBuilder sb = new StringBuilder();
        public static void main(String[] args) throws IOException {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            //해당 숫자가 넣었었는지 체크
            check = new boolean[n];
            //숫자를 담을 배열
            answer = new int[m];

            dfs(n,m,0);
            System.out.println(sb);
        }
        public static void dfs(int n, int m, int depth){
            if(depth == m){
                for (int i :
                        answer) {
                    sb.append(i).append(" ");
                }
                sb.append("\n");
                return;
            }

            for(int i =0;i < n;i++){
                if(!check[i]){
                    check[i] = true;
                    answer[depth] = i+1;

                    dfs(n,m,depth+1);
                    check[i] = false;
                }
            }

        }
    }