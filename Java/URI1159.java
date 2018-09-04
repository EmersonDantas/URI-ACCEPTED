import java.util.Scanner;
public class URI1159{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = -1;
        int pares = 0;
        int cont = 0;
        int soma;
        while(x != 0){
            soma = 0;
            pares = 0;
            x = input.nextInt();
            cont = x;
            while(pares < 5 && x != 0){
                if (cont % 2 == 0){
                    soma += cont;
                    pares++;
                }
                cont++;
            }
            if (x != 0){
                System.out.println(soma);
            }
        }
    }
}