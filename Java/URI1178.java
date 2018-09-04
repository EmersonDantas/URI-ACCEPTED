import java.util.Scanner;
public class URI1178{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double valor = input.nextDouble();
        for (int k = 0; k < 100;k++){
            System.out.printf("N[%d] = %.4f\n", k, valor);
            valor = valor/2;
        }
    }
}