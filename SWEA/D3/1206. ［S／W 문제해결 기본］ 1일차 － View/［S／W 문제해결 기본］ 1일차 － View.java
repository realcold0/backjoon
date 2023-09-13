/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        for(int testCaseNum =1;testCaseNum <=10;testCaseNum ++)
        {

            int N = Integer.parseInt(br.readLine());  //건물 갯수
            int[] build = new int[N];
            int output =0;

            st = new StringTokenizer(br.readLine(), " ");  //건물리스트
            for(int i = 0; i< N; i++){
                build[i] = Integer.parseInt(st.nextToken());

            }

            for(int i = 2; i< N-2;i++)
            {

                if(build[i] > build[i -1] && build[i] > build[i -2] && build[i] > build[i +1] && build[i] > build[i +2] )
                {
                    int max;
                    max = Math.max(build[i-2] ,build[i-1] );
                    max = Math.max(build[i+1] ,max  );
                    max = Math.max(build[i+2] ,max  );
                    output += build[i] - max;
                }

            }


            System.out.println("#"+ testCaseNum + " " +output);

        }
	}
}