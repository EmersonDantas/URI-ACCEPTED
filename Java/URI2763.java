import java.util.Scanner;
public class URI2763{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String [] cpf = input.nextLine().split("[\\W]");
        for(String a:cpf){
            System.out.println(a);
        }
    }
}