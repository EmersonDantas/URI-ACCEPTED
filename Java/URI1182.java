import java.util.Scanner;
public class URI1182{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double [][] matrix = new double [12][12];

        double soma = 0;
        double media = 0;

        int coluna = input.nextInt();
        input.nextLine();
        String op = input.nextLine();

        for (int k = 0; k < matrix.length;k++){
            for (int i = 0; i < matrix[k].length;i++){
                matrix[k][i] = input.nextDouble();
            }
        }

        for (int k = 0; k < matrix.length;k++){
            soma += matrix[k][coluna];
        }

        if(op.equals("S")){
            System.out.printf("%.1f\n",soma);
        }else if(op.equals("M")){
            System.out.printf("%.1f\n",soma/12);
        }
    }
}