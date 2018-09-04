import java.util.Scanner;
public class URI1133{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int x,y;

		x = input.nextInt();
		y = input.nextInt();

		int maior,menor;
		if (x > y){
			maior = x;
			menor = y;
		}else{
			maior = y;
			menor = x;
		}

		for (int k = menor+1; k < maior; k++){
			if(k % 5 == 2 || k % 5 == 3){
				System.out.println(k);
			}
		}
	}
}