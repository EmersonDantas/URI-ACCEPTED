import java.util.Scanner;
public class URI2059{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int p,j1,j2,r,a;
        p = input.nextInt(); // Escolha do jogador 1 (1 = par, 0 = impar)
        j1 = input.nextInt(); // Numero escolhido pelo jogador 1
        j2 = input.nextInt(); // Numero escolhido pelo jogador 2
        r = input.nextInt(); // se o jogador 1 vai roubar (1 = true, 0 = false)
        a = input.nextInt(); // se o jogador 2 vai acusar o jogador 1 de roubo (1 = true, 0 = false)

        int soma = j1+j2;
        //condições para o jogador 1 ganhar
        if(r == 1){
            if(a == 1){
                System.out.println("Jogador 2 ganha!");
            }else{
                System.out.println("Jogador 1 ganha!");
            }
        }else{
            if(a == 1){
                System.out.println("Jogador 1 ganha!");
            }else{
                if(soma%2 == 0 && p == 1 || soma%2 != 0 && p == 0){
                    System.out.println("Jogador 1 ganha!");
                }else{
                    System.out.println("Jogador 2 ganha!");
                }
            }
        }
    }
}