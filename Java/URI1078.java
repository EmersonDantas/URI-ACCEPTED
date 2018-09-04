import java.util.Scanner;

public class URI1078 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int produto = 0;
		for (int k = 1; k <= 10; k++) {
			produto = (k * n);
			System.out.printf("%d x %d = %d\n",k, n,produto);
			
		}
		
	}

}
