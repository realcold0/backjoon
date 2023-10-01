import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static int M;
    static int[] arr2;
    public static void main(String[] args) throws IOException {

        //줄마다 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        arr = new int[N];
        for(int i =0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); //이분 탐색을 위한 정렬

        M = Integer.parseInt(br.readLine()); //m입력받기
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        arr2 = new int[M];
        for(int i = 0; i < M; i++){
            System.out.println(binarySearch(Integer.parseInt(st2.nextToken()), 0, arr.length -1));
        }




    }

    public static int binarySearch(int num, int low, int high){
        int mid;

        if(low <= high){
            mid = (low + high)/ 2;

            if(arr[mid] == num){
                return 1;
            }
            if(arr[mid] > num){
                return binarySearch(num, low, mid -1);
            }
            else{
                return binarySearch(num, mid +1,high);
            }
        }
        return 0;
    }



}