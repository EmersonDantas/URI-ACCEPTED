import java.util.Scanner;
public class URI1435{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = -1;
        int bordas = 1;

        while (n != 0){
            n = input.nextInt();
            int [] [] matriz = new int [n][n];
            for (int linha = 0; linha < n; linha++){
                for (int coluna = 0; coluna < n; coluna++){
                    matriz[linha][coluna] = bordas;
                }
            }
        }
        
    }
}