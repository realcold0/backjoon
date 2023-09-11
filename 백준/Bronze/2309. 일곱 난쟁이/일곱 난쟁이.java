import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] dwarf  = new int[9];
        int sum =0;

        for(int i = 0; i< 9;i++)
        {
            dwarf[i] = scanner.nextInt();
            sum += dwarf[i];
        }

        Arrays.sort(dwarf);

        for(int i = 0;i<dwarf.length-1;i++)
        {
            for(int j = i +1; j< dwarf.length;j++)
            {
                if(sum - dwarf[i] - dwarf[j] == 100)
                {
                    dwarf[i] = 101;
                    dwarf[j] = 101;
                    Arrays.sort(dwarf);
                    for(int k = 0; k < 7; k++)
                    {
                        System.out.println(dwarf[k]);
                    }
                    return;
                }
            }
        }

    }

}