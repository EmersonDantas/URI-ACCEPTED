import java.util.Scanner;
public class URI1051{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		double renda = Double.parseDouble(input.nextLine());
		double taxa = 0;
		double diferenca = 0;

		if(renda> 4500){
			taxa  = 1000* 0.08 + 1500 * 0.18;
			diferenca = renda - 4500;
			taxa += diferenca * 0.28;
		}else if (renda > 3000){
			taxa = 1000 * 0.08;
			diferenca = renda - 3000;
			taxa += diferenca * 0.18;
		}else if(renda > 2000){
			diferenca = renda - 2000;
			taxa = diferenca * 0.08;
		}

		if(taxa > 0){
			System.out.printf("R$ %.2f\n", taxa);
		}else{
			System.out.println("Isento");
		}
	}

}