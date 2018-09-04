import java.util.Scanner;

public class URI1021 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float valor = leitor.nextFloat();
		float [] lista = {100,50,20,10,5,2,1, 0.50f,0.25f,0.10f,0.05f,0.01f};
		int temp = 0;
		valor += 0.001f;
		int [] result = new int [12];
		for (int k = 0; k < lista.length; k++) {
			temp = (int) (valor / lista[k]);
			result[k] = temp;
			valor -= temp * lista[k];
		}
		System.out.printf("NOTAS:\n%d nota(s) de R$ 100.00\n%d nota(s) de R$ 50.00\n%d nota(s) de R$ 20.00\n%d nota(s) de R$ 10.00\n%d nota(s) de R$ 5.00\n%d nota(s) de R$ 2.00\nMOEDAS:\n%d moeda(s) de R$ 1.00\n%d moeda(s) de R$ 0.50\n%d moeda(s) de R$ 0.25\n%d moeda(s) de R$ 0.10\n%d moeda(s) de R$ 0.05\n%d moeda(s) de R$ 0.01\n",result[0], result[1],result[2],result[3],result[4],result[5],result[6],result[7],result[8],result[9],result[10], result[11]);	
	}

}
