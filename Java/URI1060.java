import java.util.Scanner;
public class URI1060 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor = 0;
		int positivos = 0;
		for (int k = 0; k < 6; k++) {
			valor = leitor.nextDouble();
			if (valor > 0) {
				positivos++;
			}
		}
		System.out.printf("%d valores positivos\n", positivos);
		leitor.close();
	}

}
