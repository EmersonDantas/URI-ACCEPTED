import java.util.Scanner;

public class URI1050 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int erroCont = 0;
		int [] ddd = {61,71,11,21,32,19,27,31};
		String [] destino = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"};
		int dddUserInput = leitor.nextInt();
		for (int k = 0; k < ddd.length; k++) {
			if (dddUserInput == ddd[k]) {
				System.out.println(destino[k]);
			}else {
				erroCont ++;
			}
		}if (erroCont == ddd.length) {
			System.out.println("DDD nao cadastrado");
		}
		leitor.close();
	}

}
