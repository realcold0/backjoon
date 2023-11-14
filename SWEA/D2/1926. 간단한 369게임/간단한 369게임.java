import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String num = Integer.toString(i);
            boolean isthree = true;
            for (int j = 0; j < num.length(); j++) { //각 자리수 확인
                int checkNum = num.charAt(j) - '0';
                if( checkNum == 3 || checkNum == 6|| checkNum == 9){
                    sb.append("-");
                    isthree = false;
                }

            }
            if(!isthree){
                sb.append(" ");
            }
            
            if(isthree){
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }



}