import java.util.Scanner;
public class URI1114{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int senha = 2002;
		boolean pass = false;
		while (!pass){
			int tentativa = input.nextInt();
			if (senha == tentativa){
				pass = true;
				System.out.println("Acesso Permitido");
			}else{
				System.out.println("Senha Invalida");
			}
		}
	}
}