import java.util.Scanner;
public class URI1985{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n,a,b;
        double soma = 0;
        double [] precos = {1.50,2.50,3.50,4.50,5.50};

        n = input.nextInt();
        for(int k = 0; k < n;k++){
            a = input.nextInt();
            b = input.nextInt();

            for(int i = 1; i <= 5; i++){
                if(a == 1000+i){
                    soma += precos[i-1] * b;
                }
            }

        }
        System.out.printf("%.2f\n",soma);
    }
}