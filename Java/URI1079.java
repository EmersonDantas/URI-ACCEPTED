import java.util.Scanner;

public class URI1079 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		Double [] resultado = new Double[n];
		for (int k = 0; k < n; k++) {
			Double num1 = leitor.nextDouble();
			Double num2 = leitor.nextDouble();
			Double num3 = leitor.nextDouble();
			resultado[k] = (((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10);
			
		}
		for (int i = 0; i < resultado.length; i++) {
			System.out.printf("%.1f\n",resultado[i]);
		}
	}

}
