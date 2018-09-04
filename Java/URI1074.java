import java.util.Scanner;

public class URI1074 {
	public static void main(String[] arg) {
		Scanner entrada = new Scanner(System.in);
		int quantidade = entrada.nextInt();
		for (int k = 0; k < quantidade; k++) {
			int n = entrada.nextInt();
			if (n == 0) {
				System.out.println("NULL");
			}else if (n % 2 == 0) {
				System.out.print("EVEN ");
			}else{
				System.out.print("ODD ");
			}
			if (n != 0) {
				if (n > 0){
					System.out.println("POSITIVE");
				}else {
					System.out.println("NEGATIVE");
				}
			}
		}
	}
}

	