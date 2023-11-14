import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 99;
        if(n < 100){
            System.out.println(n);
        }
        else{
            for(int i = 100;i <=n;i++){ //3자리 이상
                String num = Integer.toString(i);
                int arr[] = new int[num.length()];
                //각자리수가 등차인지
                for(int j = 0;j<num.length();j++){
                    arr[j] = num.charAt(j) - '0';
                }
                boolean check = true;
                for (int j = 0; j < num.length() - 2 ; j++) {
                    if(arr[j+1] - arr[j] != arr[j+2] - arr[j+1]){
                        check = false;
                    }
                }

                if(check){
                    count++;
                }
            }
            System.out.println(count);
        }

    }



}