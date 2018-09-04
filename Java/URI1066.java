import java.util.Scanner;

public class URI1066 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor = 0;
		int qposi = 0;
		int qneg = 0;
		int qpar = 0;
		int qimp = 0;
		for (int k = 0; k < 5; k++) {
			valor = leitor.nextInt();
			if (valor > 0) {
				qposi++;
			}else if (valor < 0) {
				qneg++;
			}
			if (valor % 2 == 0) {
				qpar++;
			}else {
				qimp++;
			}
		}
		System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",qpar, qimp, qposi, qneg);
		leitor.close();
	}

}
