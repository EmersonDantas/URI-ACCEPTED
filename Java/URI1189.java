import java.util.Scanner;
public class URI1189{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = 12;
        double [][] matriz = new double [n][n];
        double soma = 0;
        int cont = 0;
        int controle = n-1;

        String op = input.nextLine();

        for (int k = 0; k < n; k++){
            for (int i = 0; i < n; i++){
                matriz[k][i] = input.nextDouble();
            }
        }

        for (int linha = 0; linha < n; linha++){
            for (int coluna = 0; coluna < n;coluna++){
                if ((coluna < controle) && (coluna < linha)){
                    soma += matriz[linha][coluna];
                    cont++;
                }
            }controle--;
        }

        if (op.equals("S")){
            System.out.printf("%.1f\n",soma);
        }else if (op.equals("M")){
            System.out.printf("%.1f\n",soma/cont);
        }
    }
}