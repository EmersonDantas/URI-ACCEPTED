import java.util.Scanner;
public class URI1158{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x,y, soma;
        
        for (int k = 0; k<n;k++){
            soma = 0;
            x = input.nextInt();
            y = input.nextInt();

            for (int i = 1; i <= y;){
                if (x % 2 != 0){
                    soma += x;
                    i++;
                }
                x++;
            }
            System.out.println(soma);

        }
        
    }
}