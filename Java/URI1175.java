import java.util.Scanner;
public class URI1175{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int [] vetor = new int[20];

        for (int k = 0; k < vetor.length;k++){
            vetor[k] = input.nextInt();
        }

        for (int i = 0; i < (vetor.length/2); i++){
            int temp1 = vetor[i];
            int temp2 = vetor[(vetor.length-1) - i];
            vetor[(vetor.length-1) - i] = temp1;
            vetor[i] = temp2;
        }

        for (int k = 0; k < vetor.length;k++){
            System.out.printf("N[%d] = %d\n",k,vetor[k]);
        }
    }
}