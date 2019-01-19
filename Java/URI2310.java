import java.util.Scanner;

public class URI2310{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n, s, b, a, ss, sb, sa;
        s = b = a = ss = sb = sa = 0;
        String[] entrada1, entrada2;
        n = Integer.parseInt(input.nextLine());
        for(int k = 0; k < n; k++){
            input.nextLine();
            entrada1 = input.nextLine().split(" ");
            s += Integer.parseInt(entrada1[0]); //Tentativas de saque
            b += Integer.parseInt(entrada1[1]); //Tentativas de bloqueio
            a += Integer.parseInt(entrada1[2]); //Tentativas de ataque

            entrada2 = input.nextLine().split(" ");
            ss += Integer.parseInt(entrada2[0]); //Saques com sucesso
            sb += Integer.parseInt(entrada2[1]); // Bloqueios com sucesso
            sa += Integer.parseInt(entrada2[2]); //Ataques com sucesso
        }

        System.out.printf("Pontos de Saque: %.2f %%.\n"+
                        "Pontos de Bloqueio: %.2f %%.\n"+
                        "Pontos de Ataque: %.2f %%.\n", (double)(100.0/s)*ss, (double)(100.0/b)*sb, (double)(100.0/a)*sa);
    }
}