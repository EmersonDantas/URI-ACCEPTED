import java.util.Scanner;
public class URI1961{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int p,n,resultado;
        resultado = 0;

        p = input.nextInt();
        n = input.nextInt();
        input.nextLine();
        String [] canos = input.nextLine().split(" ");

        for (int k = 0; k < n-1; k++){
            int canoAtual = Integer.parseInt(canos[k]);
            int pxmCano = Integer.parseInt(canos[k+1]);
            if (canoAtual+p >= pxmCano && Math.abs(pxmCano-canoAtual) <= p){
                resultado++;
            }
        }
        if (resultado == canos.length-1){
            System.out.println("YOU WIN");
        }else{
            System.out.println("GAME OVER");
        }
    }
}