import java.util.Scanner;

public class URI1067 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor = leitor.nextInt();
		for (int k = 1; k <= valor; k++) {
			if (k % 2 > 0) {
				System.out.println(k);
			}
		}
		leitor.close();
	}

}
