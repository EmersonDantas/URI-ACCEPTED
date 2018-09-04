import java.util.Scanner;
public class URI1113{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int x, y;
		x = 1;
		y = 2;
		while(x != y){
			x = input.nextInt();
			y = input.nextInt();

			if (x != y){
				if (x > y){
					System.out.println("Decrescente");
				}else{
					System.out.println("Crescente");
				}
			}
		}
	}
}