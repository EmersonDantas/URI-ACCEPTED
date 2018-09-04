import java.util.Scanner;

public class URI1172 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[10];
		int num = 0;
		int [] lista = {}; 
		for (int i = 0; i < 10; i++) {
			num = Integer.parseInt(entrada.nextLine());
			vetor[i] = num;
		}
		for (int k = 0; k < vetor.length; k++){
			if (vetor[k] <= 0){
				vetor[k] = 1;
			}
			System.out.printf("X[%d] = %d\n",k, vetor[k]);
		}	
		entrada.close();
	}

}
