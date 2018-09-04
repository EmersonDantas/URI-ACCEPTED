import java.util.Scanner;
public class URI1116{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float x,y,n;
		n = input.nextInt();
		for (int k = 0; k < n; k++){
			x = input.nextInt();
			y = input.nextInt();
			if (y == 0){
				System.out.println("divisao impossivel");
			}else{
				System.out.println(x/y);
			}
		}
	}
}