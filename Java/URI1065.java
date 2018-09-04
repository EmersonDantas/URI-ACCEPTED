import java.util.Scanner;

public class URI1065 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor = 0;
		int contPares = 0;
		for (int k = 0; k < 5; k++) {
			valor = leitor.nextInt();
			if (valor % 2 == 0) {
				contPares++;
			}
		}
		System.out.printf("%d valores pares\n", contPares);
		leitor.close();
	}

}
