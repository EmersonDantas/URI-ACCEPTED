import java.util.Scanner;
public class URI1151{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int penul,ult,fibo;
        penul = 0;
        ult = 1;
		fibo = penul + ult;
		System.out.print(0+" "+1+" ");
        for (int k = 0; k < n-2; k++){
            if (k == n-3){
                System.out.print(fibo);
            }else{
                System.out.print(fibo+" ");
            }
            penul = ult;
            ult = fibo;
            fibo = penul + ult;
            
		}
		System.out.println();
    }
}
