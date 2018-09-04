import java.util.Scanner;

public class URI1010 {
	public static void main(String[] args) {
		double soma = 0;
		int a, b;
		double c;
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 2; i++){
			String valores[] = entrada.nextLine().split(" ");
			a = Integer.parseInt(valores[0]);
			b = Integer.parseInt(valores[1]);
			c = Double.parseDouble(valores[2]);
			soma += (b * c);
		}
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);
		entrada.close();
	}

}
 