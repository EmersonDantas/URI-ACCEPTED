import java.util.Scanner;

public class URI1037 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double num = leitor.nextDouble();
		int [][] lista = {{0,25}, {25,50}, {50,75}, {75,100}};
		for (int k = 0; k < lista.length; k++) {
			if (lista[k][0] <= num && num <= lista[k][1] && k == 0) {
				System.out.println("Intervalo [0,25]");
				break;
			}else if (lista[k][0] < num && num <= lista[k][1]) {
				System.out.printf("Intervalo (%d,%d]\n",lista[k][0], lista[k][1]);
				break;
			}else {
				if (k == 3) {
					System.out.println("Fora de intervalo");
				}
			}
		}
	}
}
