public class URI1097{
	public static void main(String [] args){
		int j = 7;
		for (int i = 1; i <= 9; i+=2){
			for (int k = 1; k <= 3; k++){
				System.out.printf("I=%d J=%d\n",i,j);
				j -= 1;
			}
			j += 5;
		}
	}
}