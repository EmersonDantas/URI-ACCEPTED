import java.util.Scanner;
public class URI1101{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int maior, menor, soma, m, n;
		m = 1;
		n = 1;
		
		while (m > 0 && n > 0){
			soma = 0;
			m = input.nextInt();
			n = input.nextInt();

			if (m > 0 && n > 0){
				if (m > n){
					maior = m;
					menor = n;
				}else{
					maior = n;
					menor = m;
				}

				for (int k = menor; k <= maior; k++){
					soma += k;
					System.out.printf("%d ",k);
				}
				System.out.printf("Sum=%d\n",soma);

			}


		}
		
	}
}