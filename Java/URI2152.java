import java.util.Scanner;
public class URI2152{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n, h, m, o;
        n = input.nextInt();
        for (int k = 0; k < n; k++){
            h = input.nextInt(); // Hora da ocorrência
            m = input.nextInt(); // Minuto da ocorrência
            o = input.nextInt(); // 0 se a porta fechou ou 1 se abriu (ocorrência)
            System.out.printf("%02d:%02d - %s\n",h,m,o == 1?"A porta abriu!":"A porta fechou!");
        }
    }
}