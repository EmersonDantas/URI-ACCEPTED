import java.util.Scanner;
public class URI1144{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n;i++){
			for (int j = i, k = (j* i), l = (k * j);j == i ;j++) {
				System.out.print(j+" "+k+" "+l+"\n");
				System.out.print(j+" "+(k+1)+" "+(l+1)+"\n");
			}
		}
	}
}