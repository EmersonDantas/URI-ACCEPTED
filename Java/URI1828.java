import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class URI1828{
    public static void main(String[]args) throws IOException{
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(leitor.readLine());
        String pedra,papel,tesoura,lagarto,spock;
        pedra = "pedra";
        papel = "papel";
        tesoura = "tesoura";
        lagarto = "lagarto";
        spock = "Spock";
        for (int k = 0; k < n;k++){
            String [] jogada = leitor.readLine().split(" ");
            String jogador1 = jogada[0];
            String jogador2 = jogada[1];

            //Casos em que Sheldon ganha
            if ((jogador1.equals(tesoura) && jogador2.equals(papel)) || (jogador1.equals(tesoura) && jogador2.equals(lagarto)) || 
            (jogador1.equals(papel) && jogador2.equals(pedra)) || (jogador1.equals(papel) && jogador2.equals(spock)) || 
            (jogador1.equals(pedra) && jogador2.equals(lagarto)) || (jogador1.equals(pedra) && jogador2.equals(tesoura)) || 
            (jogador1.equals(lagarto) && jogador2.equals(spock)) || (jogador1.equals(lagarto) && jogador2.equals(papel)) || 
            (jogador1.equals(spock) && jogador2.equals(tesoura)) || (jogador1.equals(spock) && jogador2.equals(pedra))){
                System.out.println("Caso #"+(k+1)+": Bazinga!");

            }else if (jogador1.equals(jogador2)){//Empate
                System.out.println("Caso #"+(k+1)+": De novo!");
            }else{//Quando Raj ganha
                System.out.println("Caso #"+(k+1)+": Raj trapaceou!");
            }
        }
    }
}