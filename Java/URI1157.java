import java.util.Scanner;
public class URI1157{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for ( int k = 1; k <= n;k++){
            if(n % k == 0){
                System.out.println(k);
            }
        }
    }
}
