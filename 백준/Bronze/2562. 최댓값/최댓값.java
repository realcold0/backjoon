import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];


        for(int i = 0; i < 9; i++)
        {
            array[i] = scanner.nextInt();
        }

        int count = 0, max =0, value;

        for(int i = 0; i < 9;i++)
        {
            value = array[i];
            if(value > max)
            {
                max = value;
                count = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(count);

    }
}