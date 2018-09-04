import java.util.Scanner;
public class URI1117{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float nota1,soma,media;
		soma = 0;
		int cont = 0;


		while(cont < 2){
			nota1 = input.nextFloat();
			if (nota1 < 0 || nota1 > 10){
				System.out.println("nota invalida");
			}else{
				cont++;
				soma += nota1;
			}
		}
		media = soma/2;
		System.out.printf("media = %.2f\n",media);
	}
}