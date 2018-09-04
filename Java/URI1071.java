import java.util.Scanner;

public class URI1071 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x = leitor.nextInt();
		int y = leitor.nextInt();
		int menor = 0;
		int maior = 0;
		int soma = 0;
		if (x > y) {
			menor = y;
			maior = x;
		}else {
			menor = x;
			maior = y;
		}

		for (int k = (menor + 1); k < maior; k++ ) {
			if (k % 2 != 0) {
				soma += k;
			}
		}
		System.out.println(soma);
	}
}
