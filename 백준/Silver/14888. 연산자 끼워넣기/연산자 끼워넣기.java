import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;


public class Main {
    static int[] arr1, arr2;
    static int n;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        arr1 = new int[n];
        arr2 = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i =0;i <n; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for(int i =0;i <4; i++){
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        dfs(arr1[0], 1);

        System.out.println(max);
        System.out.println(min);



    }


    public static void dfs(int num, int idx){
        if(idx == n)
        {
            max = Math.max(num, max);
            min = Math.min(num, min);
            return;
        }
        for(int i =0;i<4;i++){
            if(arr2[i] > 0){
                arr2[i]--;

                //1 2 3 4 5 6 7 8 9
                //2 2 2 2

                switch (i){
                    case 0:
                        dfs(num + arr1[idx], idx+1);
                        break;
                    case 1:
                        dfs(num - arr1[idx], idx+1);
                        break;
                    case 2:
                        dfs(num * arr1[idx], idx+1);
                        break;
                    case 3:
                        dfs(num / arr1[idx], idx+1);
                        break;
                }
                arr2[i]++;
            }
        }
    }
}