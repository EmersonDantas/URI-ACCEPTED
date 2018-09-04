import java.util.Scanner;
public class URI1153{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fatorial = 0;
        int res = n;
        while( n != 1){
            res = res * (n-1);
            fatorial = res;
            n--;
        }System.out.println(fatorial);
    }
}