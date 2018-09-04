import java.util.Scanner;

public class URI1094 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String rato = "R";
		String sapo = "S";
		String coelho = "C";
		int quantExpRato = 0;
		int quantExpSapo = 0;
		int quantExpCoelho = 0;
		int total;
		float pr;
		float ps;
		float pc;
	
		int num = input.nextInt();
		input.nextLine();
		for (int k = 0; k < num; k++) {
			String [] exp = input.nextLine().split(" ");
			if (exp[1].startsWith(rato)) {
				quantExpRato += Integer.parseInt(exp[0]);
				
			}else if (exp[1].startsWith(sapo)) {
				quantExpSapo += Integer.parseInt(exp[0]);
				
			}else if (exp[1].startsWith(coelho)) {
				quantExpCoelho += Integer.parseInt(exp[0]);
				
			}
		}
		total = quantExpRato + quantExpSapo + quantExpCoelho;
		pr = (float) ((quantExpRato * 100.00)/total);
		ps = (float) ((quantExpSapo * 100.00)/total);
		pc = (float) ((quantExpCoelho) * 100.00/total);
		System.out.printf("Total: %d cobaias\n" + 
				"Total de coelhos: %d\n" + 
				"Total de ratos: %d\n" + 
				"Total de sapos: %d\n" + 
				"Percentual de coelhos: %.2f %%\n" + 
				"Percentual de ratos: %.2f %%\n" + 
				"Percentual de sapos: %.2f %%\n", total, quantExpCoelho, quantExpRato, quantExpSapo, pc, pr, ps );
		input.close();
	}

}
