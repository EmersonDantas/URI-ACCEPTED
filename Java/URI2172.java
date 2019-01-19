import java.util.Scanner;

public class URI2172{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int x,m;

        while((x = input.nextInt()) != 0 && (m = input.nextInt()) != 0){
            System.out.println(x*m);
        }
    }
}