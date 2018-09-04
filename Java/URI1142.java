import java.util.Scanner;
public class URI1142{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cont = 1;

		for (int k = 0; k < n; k++){
			for (int i = 0; i < 4; i++){
				if (i == 3){
					System.out.print("PUM\n");
					cont++;
				}else{
					System.out.print(cont + " ");
					cont++;
				}
				
			}
		}
	}
}