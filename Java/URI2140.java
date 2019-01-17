import java.util.Scanner;
public class URI2140{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n, m, troco; 
        // n = valor da compra
        // m = valor pago pelo cliente
        int [] notas = {2, 5, 10, 20, 50, 100};
        while((n = input.nextInt()) != 0 && (m = input.nextInt()) != 0){
            troco = m - n;
            if(verificaTroco(notas, troco)){
                System.out.println("possible");
            }else{
                System.out.println("impossible");
            }
        }
    }

    public static boolean verificaTroco(int[] notas, int troco){
        for(int a = 0; a < notas.length; a++){
            for(int b = 0; b < notas.length; b++){
                if((notas[a] + notas[b]) == troco){
                    return true;
                }
            }
        }
        return false;
    }
}