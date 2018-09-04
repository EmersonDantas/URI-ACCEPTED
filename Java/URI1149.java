import java.util.Scanner;
public class URI1149{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n = -1;
		int soma = 0;
		int a = input.nextInt();
		while (n <= 0){
			n = input.nextInt();
		}
		soma = a;
		for (int k = 0; k < n-1; k++){
			soma += ++a;
		}
		System.out.println(soma);
	}
}