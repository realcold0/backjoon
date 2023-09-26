import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] coin = new int[N];

        for(int i = 0; i < N;i++)
        {
            coin[i] = Integer.parseInt(br.readLine());
        }



        //최대한 큰 동전부터
        for(int i = coin.length -1; i >=0 ; i--){
            if(K >= coin[i]){
                count += K/coin[i];
                K  = K%coin[i];
            }
        }

        System.out.print(count);



    }

}