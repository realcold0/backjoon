
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int aUp = Integer.parseInt(st.nextToken());
        int aDown = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int bUp = Integer.parseInt(st2.nextToken());
        int bDown = Integer.parseInt(st2.nextToken());

        int tmpDown = aDown * bDown;
        int tmpUp = (aUp * bDown) + (bUp * aDown);

        int gcd = gcd(tmpUp, tmpDown);
        tmpUp /= gcd;
        tmpDown /= gcd;

        StringBuilder sb = new StringBuilder();
        sb.append(tmpUp).append(" ").append(tmpDown);
        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }

    public static int gcd(int a, int b){
        if( b ==0) return a;
        return gcd(b, a%b);
    }
    
}
