import java.util.Scanner;

public class URI1051 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double salario = leitor.nextDouble();
		double taxa = 0;
		
		for (int k = 0; k < 4;k++) {
			if (salario >= 0 && salario <= 2000) {
				taxa += 0;
			}else{
				salario -= 2000;
			}if (salario > 2000 && salario <= 3000) {
				taxa += 0.08;
				salario -= 1000;
			}if (salario > 3000 && salario <= 4500) {
				taxa += 0.18;
				salario -= 1000;
			}if (salario > 4500) {
				taxa += 0.28;
				salario -= 1000;
			}
		}
	}
}

