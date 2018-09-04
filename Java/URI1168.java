import java.util.Scanner;
public class URI1168{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int soma = 0;
		int n = Integer.parseInt(input.nextLine());
		for (int k = 0; k < n;k++){
			String V = input.nextLine();
			soma = 0;
			for (int a = 0; a < V.length(); a++){
				char letra = V.charAt(a);
				if (letra == ('1')){
		            soma += 2;
				}else if (letra == ('2') || letra == ('3') || letra == ('5')){
		            soma += 5;
				}else if (letra == ('4')){
		            soma += 4;
				}else if (letra == ('6') || letra == ('9') || letra == ('0')){
		            soma += 6;
				}else if (letra == ('7')){
		            soma += 3;
				}else if (letra == ('8')){
		            soma += 7;
				}
			}
			System.out.println(soma+" leds");
		}
	}
}