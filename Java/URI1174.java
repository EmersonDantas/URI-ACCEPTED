import java.util.Scanner;
public class URI1174{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double [] vetor = new double [100];

        for (int k = 0; k < vetor.length; k++){
            vetor[k] = input.nextDouble();
        }

        for (int i = 0; i < vetor.length;i++){
            if(vetor[i] <= 10){
                System.out.printf("A[%d] = %.1f\n",i,vetor[i]);
            }
        }
    }
}