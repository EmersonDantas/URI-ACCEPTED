import java.util.Scanner;
public class URI1099{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int soma = 0;
		int maior, menor;
		for (int i = 0; i < n; i++){
			soma = 0;
			int x = input.nextInt();
			int y = input.nextInt();

			if (x > y){
				maior = x;
				menor = y;
			}else{
				maior = y;
				menor = x;
			}

			for (int k = menor + 1; k < maior; k++){
				if (k % 2 > 0){
					soma += k;
				}
			}
			System.out.println(soma);
		}
	}
}