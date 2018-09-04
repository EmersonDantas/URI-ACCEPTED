import java.util.Scanner;
public class URI1177{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int [] vetor = new int [1000];
        int n = input.nextInt();
        for (int i = 0; i < vetor.length;){
            for (int k = 0; k < n; k++){
                if (i < vetor.length){
                    vetor[i] = k;
                    i++;
                    System.out.printf("N[%d] = %d\n",i-1, vetor[k]);
                }
            }
        }
    }
}