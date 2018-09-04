import java.util.Scanner;
public class URI1164{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int somaNumDivisores = 0;
        for (int k = 0; k < n; k++){
            somaNumDivisores = 0;
            int t = input.nextInt();
            for (int j = 1; j < t; j++){
                if(t%j==0){
                    somaNumDivisores += j;
                }
            }
            if (somaNumDivisores == t){
                System.out.println(t+" eh perfeito");
            }else{
                System.out.println(t+" nao eh perfeito");
            }
        }
    }
}