import java.util.Scanner;

public class URI1080 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor = leitor.nextInt();
		int maior = valor;
		int posiMaior = 1;
		for (int k = 2; k <= 100; k++) {
			valor = leitor.nextInt();
			if (valor > maior) {
				maior = valor;
				posiMaior = k;
			}
			
		}
		System.out.println(maior);
		System.out.println(posiMaior);
	}

}
