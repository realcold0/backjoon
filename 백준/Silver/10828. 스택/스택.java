import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] stack;
    public static int size = -1;
    public static int N;
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

         N =  Integer.parseInt(br.readLine());

        stack = new int[N];

        for(int i=0;i<N;i++)
        {
            st= new StringTokenizer(br.readLine(), " "); // 공백 기준으로 분리
            switch (st.nextToken()){
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append(("\n"));
                    break;
                default:
                    break;

            }
        }
        System.out.println(sb);

    }

    public static void push(int num){
        if(size < N)
        {
            size++;
            stack[size] = num;
        }else{
            return;
        }

    }

    public static int pop()
    {
        if(size == -1)
        {
            return size;
        }else{
            return stack[size--];
        }

    }

    public static int size(){
        return size + 1;
    }

    public static int empty(){
        if(size == -1)
        {
            return 1;

        }else{
            return 0;
        }

    }

    public static int top(){
        if(size == -1) {
            return -1;

        }else{
            return stack[size];
        }
    }
}