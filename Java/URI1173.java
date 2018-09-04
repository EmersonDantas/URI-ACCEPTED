import java.util.Scanner;

public class URI1173{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int [] vetor = new int [10];
        int n = input.nextInt();
        vetor[0] = n;
        System.out.printf("N[0] = %d\n",n);
        for (int k = 1; k < (vetor.length);k++){
            int anterior = vetor[k-1];
            vetor[k] = 2*anterior;
            System.out.printf("N[%d] = %d\n",k,vetor[k]);
        }
    }
}