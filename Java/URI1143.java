import java.util.Scanner;
public class URI1143{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int k = 1; k <= n;k++){
			System.out.print(k);
			System.out.print(" "+k*k);
			System.out.print(" "+k*k*k+"\n");
		}
	}
}