import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        size = scanner.nextInt();

        int[] array = new int[size];

        for(int i=0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.print(array[0] + " " +array[size-1]);


    }
}