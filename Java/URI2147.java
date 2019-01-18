import java.util.Scanner;
public class URI2147{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for( int k = 0; k < n; k++){
            System.out.printf("%.2f\n",input.nextLine().length()*0.01);
        }
    }
}