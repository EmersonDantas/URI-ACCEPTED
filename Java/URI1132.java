import java.util.Scanner;
public class URI1132{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int maior,menor,soma;
		soma = 0;
		if (x > y){
			maior = x;
			menor = y;
		}else{
			maior = y;
			menor = x;
		}

		for (int k = menor; k <= maior; k++){
			if (k % 13 != 0){
				soma += k;
			}
		}
		System.out.println(soma);

	}
}