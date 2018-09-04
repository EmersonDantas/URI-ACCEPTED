import java.util.Scanner;

public class URI1075 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		for (int k = 0; k < 10000; k++) {
			if (k % n == 2) {
				System.out.println(k);
			}
		}
	}

}
