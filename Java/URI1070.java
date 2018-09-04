import java.util.Scanner;

public class URI1070 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor = leitor.nextInt();
		boolean parar = false;
		int contImp = 0;
		for (int k = valor; parar != true ; k++) {
			if (k % 2 > 0) {
				System.out.println(k);
				contImp++;
			}
			if (contImp == 6) {
				parar = true;
			}
		}
		leitor.close();
	}

}
