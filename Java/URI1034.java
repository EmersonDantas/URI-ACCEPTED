import java.util.Scanner;

public class URI1034 {
	public static void main(String[] arg) {
		Scanner entrada = new Scanner(System.in);
		int valor = 0;
		int contGaso = 0;
		int contAlc = 0;
		int contDie = 0;
		while (valor != 4) {
			valor = entrada.nextInt();
			if (valor == 1) {
				contAlc++;
			}else if (valor == 2){
				contGaso++;
			}else if (valor == 3) {
				contDie++;
			}
		}
		System.out.printf("MUITO OBRIGADO\nAlcool: %s\nGasolina: %s\nDiesel: %s\n",contAlc, contGaso, contDie);
		entrada.close();
	}

}
