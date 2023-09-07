import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String Num = scanner.next();
        char[] CNum = Num.toCharArray();
        int sum = 0;

        for(int i = 0; i < N; i++)
        {
            sum += CNum[i] - '0';
        }

        System.out.println(sum);

    }


}