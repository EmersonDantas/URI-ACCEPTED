import java.util.Scanner;
public class URI1933{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b,maior;
        a = input.nextInt();
        b = input.nextInt();

        if (a > b){
            maior = a;
        }else{
            maior = b;
        }

        System.out.println(maior);
    }
}