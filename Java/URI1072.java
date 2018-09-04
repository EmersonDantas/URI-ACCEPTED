import java.util.Scanner;

public class URI1072 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int valor = 0;
		int in = 0;
		int out = 0;
		for (int k = 0; k < n; k++) {
			valor = leitor.nextInt();
			if (valor >= 10 && valor <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.printf("%d in\n%d out\n",in,out);
		leitor.close();
	}

}
