import java.util.Scanner;

public class URI1008 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		int horas = entrada.nextInt();
		double recHor = entrada.nextDouble();
		double salario = horas * recHor;
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", num, salario);
		
	}
}
