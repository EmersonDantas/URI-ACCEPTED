import java.util.Scanner;
public class URI1048 {
	public static void main(String[] args) {
		int aumentosLista[] = {0, 400, 800, 1200, 2000};
		int reajustes[] = {15, 12, 10, 7, 4};
		double reajuste = 0;
		double novoSalario = 0;
		Scanner entrada = new Scanner(System.in);
		Double salario = entrada.nextDouble();
		for (int i = 0; i < aumentosLista.length; i++) {
			if ( i != (aumentosLista.length - 1) ) {
				if (aumentosLista[i] < salario & salario <= aumentosLista[i+1]) {	
					reajuste =  reajustes[i];
					novoSalario = (salario + (salario * (reajuste/100)));
					break;
				}
				
			}else{
				reajuste =  reajustes[i];
				novoSalario = (salario + (salario * (reajuste/100)));
				}	
		}
		
		double reajusteP = (salario * (reajuste/100));
		System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %\n" , novoSalario, reajusteP, reajuste, "%");
	
	}
}