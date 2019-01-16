import java.util.Scanner;
public class URI2075{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int saida, tempoV, fuso;
        String[] entrada = input.nextLine().split(" ");
        saida = Integer.parseInt(entrada[0]);
        tempoV = Integer.parseInt(entrada[1]);
        fuso = Integer.parseInt(entrada[2]);

        int novoTemp = saida + tempoV + fuso;
        if(novoTemp >= 24){
            novoTemp -= 24;
        }else if(novoTemp < 0){
            novoTemp += 24;
        }

        System.out.println(novoTemp);
    }
}