import java.util.Scanner;
public class URI1921{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        long numLados = Long.parseLong(input.nextLine());
        System.out.println(((numLados-3) * numLados)/2);
    }
}