import java.util.Scanner;
public class URI1115{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean parar = false;
		int x,y;
		while (!parar){
			x = input.nextInt();
			y = input.nextInt();

			if (x > 0 && y > 0){
				System.out.println("primeiro");
			}else if(x < 0 && y > 0){
				System.out.println("segundo");
			}else if(x < 0 && y < 0){
				System.out.println("terceiro");
			}else if(x > 0 && y < 0){
				System.out.println("quarto");
			}else{
				parar = true;
			}
		}
	}
}