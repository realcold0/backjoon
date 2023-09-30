import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        //55-50+40
        //최소로  최대한 많이 뭉쳐서 빼야한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");  //빼기로 분해

        int sum = Integer.MAX_VALUE;
        //55 55+40
        while(st.hasMoreTokens())
        {
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+"); //더하기로 나누기

            int tmp = 0;
            while(st2.hasMoreTokens())
            {
                tmp += Integer.parseInt(st2.nextToken());  //묶음을 다 더해준다.
            }

            if(sum == Integer.MAX_VALUE) // 더하기 시작이라면
            {
                sum = tmp;
            }else{
                sum -= tmp;
            }

        }

        System.out.println(sum);    


    }
}