import java.util.Scanner;

public class URI1009 {
	public static void main(String[] arg) {
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.next();
		double salario = entrada.nextDouble();
		double vendas = entrada.nextDouble();
		double salarioTotal = salario + (vendas * 0.15);
		System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
		
	}

}
