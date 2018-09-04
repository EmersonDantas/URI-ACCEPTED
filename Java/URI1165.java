import java.util.Scanner;

public class URI1165 {
	public static void main(String[] arg) {
		Scanner entrada = new Scanner(System.in);
		int vezes = entrada.nextInt();
		for (int i = 0; i < vezes; i++) {
			int contDiv = 0;
			int n = entrada.nextInt();
			for (int a = 1; a <= n; a++){
				if(n % a == 0) {
					contDiv++;
				}
			}
			if(contDiv == 2) {
				System.out.println(n + " eh primo");
			}else {
				System.out.println(n + " nao eh primo");
			}
		}
	}

}
