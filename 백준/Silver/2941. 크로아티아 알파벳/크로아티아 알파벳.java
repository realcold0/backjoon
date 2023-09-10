import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        char[] B = A.toCharArray();
        int N =0;

        for(int i = 0; i<B.length;i++){
            if(B[i] == 'c')
            {
                if(i < B.length-1)
                {
                    if(B[i+1] == '=')
                    {
                        i++;
                    }
                    else if(B[i+1] == '-')
                    {
                        i++;
                    }
                }
                


            }
            else if(B[i] == 'd')
            {
                if(i < B.length-2) {
                    if (B[i + 1] == 'z' && B[i + 2] == '=') {
                        i++;
                        i++;
                    }
                }
                if(i < B.length-1) {
                    if (B[i + 1] == '-') {
                        i++;
                    }
                }

            }
            else if(B[i] == 'l')
            {
                if(i < B.length-1) {
                    if (B[i + 1] == 'j') {
                        i++;
                    }
                }

            }
            else if(B[i] == 'n')
            {
                if(i < B.length-1) {
                    if (B[i + 1] == 'j') {
                        i++;
                    }
                }

            }
            else if(B[i] == 's')
            {
                if(i < B.length-1) {
                    if (B[i + 1] == '=') {
                        i++;
                    }
                }

            }
            else if(B[i] == 'z')
            {
                if(i < B.length-1) {
                    if (B[i + 1] == '=') {
                        i++;
                    }
                }

            }

            N++;

        }

        System.out.println(N);
    }


}