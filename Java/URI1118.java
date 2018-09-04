import java.util.Scanner;
public class URI1118{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float nota1,soma,media;
		soma = 0;
		int cont = 0;
		boolean ok = false;
		boolean parar = false;
		while (!parar){
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
			ok = false;

			while(!ok){
				System.out.println("novo calculo (1-sim 2-nao)");
				int escolha = input.nextInt();
				switch (escolha){
					case 1:
						ok = true;
						soma = 0;
						cont = 0;
						break;
					case 2:
						ok = true;
						parar = true;
						break;
				}
			}
		}	
	}
}