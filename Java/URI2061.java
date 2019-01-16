import java.util.Scanner;
public class URI2061{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // Numero inicial de abas abertas
        int m = input.nextInt(); // Numero de ações do sujeito
        input.nextLine();
        for(int k = 0; k < m; k++){
            String acao = input.nextLine();
            if(acao.equals("fechou")){
                n++;
            }else{// Clicou
                n--;
            }
        }

        System.out.println(n);
    }
}