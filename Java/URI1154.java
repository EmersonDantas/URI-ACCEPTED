import java.util.Scanner;
public class URI1154{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = 0;
        int soma, cont;
        soma = 0;
        cont = 0;
        while(n >= 0){
            n = input.nextInt();
            if (n >= 0){
                soma += n;
                cont++;
            } 
        }
        float media = (float) soma/cont;
        System.out.printf("%.2f\n",media);
    }
}