import java.util.Scanner;

public class URI1180 {
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		int quantidade = Integer.parseInt(leitor.nextLine());	
		String[] lista = leitor.nextLine().split(" ");
		
		int menor = Integer.parseInt(lista[0]);
		int IndcMenor = 0;
		for (int i = 0; i < quantidade; i++) {
			if (Integer.parseInt(lista[i]) < menor){
				menor = Integer.parseInt(lista[i]);
				IndcMenor = i;
			}
		}
		System.out.printf("Menor valor: %d\nPosicao: %d\n", menor, IndcMenor);
	}

}
