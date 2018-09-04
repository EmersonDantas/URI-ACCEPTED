import java.util.Scanner;
public class URI1176{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        long penul,ult,fibo;

        long [] vetor = new long [61];

        vetor[0] = 0;
        vetor[1] = 1;

        for (int j = 2; j < (vetor.length); j++){
            vetor[j] = vetor[j-1] + vetor[j-2];
        }

        int t = input.nextInt();
        for (int i = 0; i < t; i++){
            int n = input.nextInt();
            System.out.printf("Fib(%d) = %d\n",n, vetor[n]);
        }
    }
}