import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            int input =  Integer.parseInt(br.readLine());

            //input이 자연수면 값을 넣고, 0이라면 배열에서 가장 큰값 출력 후 제거 , 비어있는데 0 들어오면 0 출력
            if(input == 0 && priorityQueue.isEmpty() ){  //비어있을때
                sb.append(0).append("\n");
            }
            else if(input == 0){ //출력시
                sb.append(priorityQueue.poll()).append("\n");
            }
            else{ //자연수일때
                try{
                    priorityQueue.add(input);
                }
                catch (NumberFormatException e){
                    System.out.println(e);
                }
            }
        }
        System.out.println(sb);


    }

}