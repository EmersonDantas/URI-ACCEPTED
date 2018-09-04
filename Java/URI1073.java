import java.util.Scanner;
import java.lang.Math;

public class URI1073 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int pot = 0;
		for (int k = 1; k <= n;k++) {
			pot = (int) Math.pow(k, 2);
			if (k % 2 == 0) {
				System.out.printf("%d^2 = %d\n",k, pot);
			}
		}
	}

}
