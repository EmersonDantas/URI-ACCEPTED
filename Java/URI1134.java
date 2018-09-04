import java.util.Scanner;
public class URI1134{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int n,qg,qa,qd;
		qa = 0;
		qg = 0;
		qd = 0;
		n = 0;

		while (n != 4){
			n = input.nextInt();

			switch(n){
				case 1:
					qa++;
					break;
				case 2:
					qg++;
					break;
				case 3:
					qd++;
					break;
			}
		}
		System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n",qa,qg,qd);

	}
}