import java.util.Scanner;
public class URI2031{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String ganhador,jogador1,jogador2;
        ganhador = "";
        for (int k = 0; k < n;k++){
            jogador1 = input.nextLine();
            jogador2 = input.nextLine();

            if ((jogador1.equals("ataque") && jogador2.equals("pedra")) ||
            (jogador1.equals("pedra") && jogador2.equals("papel") ||
            (jogador1.equals("ataque") && jogador2.equals("papel")))){
                ganhador = "Jogador 1 venceu";
            }else if(jogador1.equals("papel") && jogador2.equals("papel")){
                ganhador = "Ambos venceram";
            }else if(jogador1.equals("pedra") && jogador2.equals("pedra")){
                ganhador = "Sem ganhador";
            }else if(jogador1.equals("ataque") && jogador2.equals("ataque")){
                ganhador = "Aniquilacao mutua";
            }else{
                ganhador = "Jogador 2 venceu";
            }
            System.out.println(ganhador);
        }
    }
}