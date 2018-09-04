import java.util.Scanner;
public class URI1146{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n = -1;

		while (n != 0){
			n = input.nextInt();
			for (int k = 1; k <= n; k++){
				if (k == n){
					System.out.print(k);
				}else{
					System.out.print(k+" ");
				}
				
			}
			if (n != 0){
				System.out.println();
			}
		}
	}
}