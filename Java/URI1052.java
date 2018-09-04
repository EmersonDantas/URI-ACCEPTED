import java.util.Scanner;

public class URI1052 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int mes = leitor.nextInt();
		String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.println(meses[mes-1]);
	}
}
